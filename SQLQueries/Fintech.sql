CREATE DATABASE FinTech_portfolio;
USE FinTech_portfolio;

CREATE TABLE `users` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `email` VARCHAR(150) NOT NULL,
  `password_hash` VARCHAR(255) NOT NULL,
  `currency` VARCHAR(5) NOT NULL DEFAULT '₹',
  `dark_mode` BOOLEAN NOT NULL DEFAULT FALSE,
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uq_users_email` (`email`)
) ENGINE=InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
  
  CREATE TABLE stocks (
  symbol VARCHAR(20) NOT NULL,
  name VARCHAR(100) NOT NULL,
  sector VARCHAR(50) DEFAULT NULL,
  current_price DECIMAL(12,2) DEFAULT NULL,
  last_updated TIMESTAMP NULL DEFAULT NULL,

  PRIMARY KEY (symbol)

) ENGINE=InnoDB
  DEFAULT CHARSET=utf8mb4
  COLLATE=utf8mb4_unicode_ci;
  
  CREATE TABLE transactions (
  id BIGINT NOT NULL AUTO_INCREMENT,
  user_id BIGINT UNSIGNED NOT NULL,
  stock_symbol VARCHAR(20) NOT NULL,
  stock_name VARCHAR(100) NOT NULL,
  type ENUM('BUY', 'SELL') NOT NULL,
  quantity INT NOT NULL,
  price DECIMAL(12,2) NOT NULL,
  transaction_date DATE NOT NULL,
  brokerage DECIMAL(10,2) NOT NULL DEFAULT 0,
  notes TEXT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY (id),

  CONSTRAINT chk_transactions_quantity_positive 
    CHECK (quantity > 0),

  CONSTRAINT chk_transactions_price_positive 
    CHECK (price > 0),

  CONSTRAINT chk_transactions_brokerage_non_negative 
    CHECK (brokerage >= 0),

  CONSTRAINT fk_transactions_user
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE

) ENGINE=InnoDB
  DEFAULT CHARSET=utf8mb4
  COLLATE=utf8mb4_unicode_ci;
  
  CREATE INDEX idx_transactions_user 
  ON transactions (user_id);

CREATE INDEX idx_transactions_user_date 
  ON transactions (user_id, transaction_date);

CREATE INDEX idx_transactions_user_symbol 
  ON transactions (user_id, stock_symbol);
  
  CREATE TABLE watchlist (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id BIGINT UNSIGNED NOT NULL,
  stock_symbol VARCHAR(20) NOT NULL,
  stock_name VARCHAR(100) NOT NULL,
  added_date DATE NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY (id),

  CONSTRAINT fk_watchlist_user
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

  CONSTRAINT fk_watchlist_stock
    FOREIGN KEY (stock_symbol)
    REFERENCES stocks(symbol)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

CREATE INDEX idx_watchlist_user 
  ON watchlist (user_id);

CREATE INDEX idx_watchlist_user_symbol 
  ON watchlist (user_id, stock_symbol);
  
  CREATE TABLE price_alerts (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id BIGINT UNSIGNED NOT NULL,
  stock_symbol VARCHAR(20) NOT NULL,
  stock_name VARCHAR(100) NOT NULL,
  target_price DECIMAL(12,2) NOT NULL,
  direction ENUM('ABOVE', 'BELOW') NOT NULL,
  active BOOLEAN NOT NULL DEFAULT TRUE,
  triggered_at TIMESTAMP NULL DEFAULT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  PRIMARY KEY (id),

  CONSTRAINT chk_price_alerts_target_price_positive
    CHECK (target_price > 0),

  CONSTRAINT fk_price_alerts_user
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,

  CONSTRAINT fk_price_alerts_stock
    FOREIGN KEY (stock_symbol)
    REFERENCES stocks(symbol)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

CREATE INDEX idx_price_alerts_active_symbol 
  ON price_alerts (active, stock_symbol);

CREATE INDEX idx_price_alerts_user 
  ON price_alerts (user_id);

CREATE INDEX idx_price_alerts_user_symbol 
  ON price_alerts (user_id, stock_symbol);
  
  CREATE TABLE portfolio_snapshots (
  id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id BIGINT UNSIGNED NOT NULL,
  snapshot_date DATE NOT NULL,
  total_value DECIMAL(14,2) NOT NULL,
  total_invested DECIMAL(14,2) NOT NULL,

  PRIMARY KEY (id),

  UNIQUE KEY uq_snapshots_user_date (user_id, snapshot_date),

  CONSTRAINT chk_snapshot_total_value_non_negative
    CHECK (total_value >= 0),

  CONSTRAINT chk_snapshot_total_invested_non_negative
    CHECK (total_invested >= 0),

  CONSTRAINT fk_snapshots_user
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
) ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

CREATE INDEX idx_snapshots_user 
  ON portfolio_snapshots (user_id);

CREATE INDEX idx_snapshots_user_date 
  ON portfolio_snapshots (user_id, snapshot_date);