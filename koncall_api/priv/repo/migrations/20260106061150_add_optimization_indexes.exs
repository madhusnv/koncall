defmodule KoncallApi.Repo.Migrations.AddOptimizationIndexes do
  use Ecto.Migration
  
  # Disable transaction for CONCURRENTLY indexes
  @disable_ddl_transaction true
  @disable_migration_lock true

  def up do
    # Trigram extension for ILIKE searches (fast pattern matching)
    execute "CREATE EXTENSION IF NOT EXISTS pg_trgm"
    
    # Trigram indexes for search fields - enables fast ILIKE '%pattern%' queries
    execute "CREATE INDEX CONCURRENTLY IF NOT EXISTS leads_student_name_trgm ON leads USING gin (student_name gin_trgm_ops)"
    execute "CREATE INDEX CONCURRENTLY IF NOT EXISTS leads_phone_number_trgm ON leads USING gin (phone_number gin_trgm_ops)"
    execute "CREATE INDEX CONCURRENTLY IF NOT EXISTS call_logs_phone_trgm ON call_logs USING gin (phone_number gin_trgm_ops)"
    
    # Composite index for counsellor leads query (assigned_to + is_deleted + inserted_at)
    execute """
    CREATE INDEX CONCURRENTLY IF NOT EXISTS leads_assigned_to_active_idx 
    ON leads (assigned_to, inserted_at DESC) 
    WHERE is_deleted = false
    """
    
    # Composite index for branch leads query
    execute """
    CREATE INDEX CONCURRENTLY IF NOT EXISTS leads_branch_id_active_idx 
    ON leads (branch_id, inserted_at DESC) 
    WHERE is_deleted = false
    """
  end

  def down do
    execute "DROP INDEX CONCURRENTLY IF EXISTS leads_branch_id_active_idx"
    execute "DROP INDEX CONCURRENTLY IF EXISTS leads_assigned_to_active_idx"
    execute "DROP INDEX CONCURRENTLY IF EXISTS call_logs_phone_trgm"
    execute "DROP INDEX CONCURRENTLY IF EXISTS leads_phone_number_trgm"
    execute "DROP INDEX CONCURRENTLY IF EXISTS leads_student_name_trgm"
    
    # Note: We don't drop pg_trgm extension as other things may depend on it
  end
end
