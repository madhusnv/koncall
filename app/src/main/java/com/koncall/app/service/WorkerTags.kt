package com.koncall.app.service

/**
 * Worker tagging system for selective WorkManager operations.
 * 
 * Enterprise pattern: Categorize workers by purpose to enable selective cancellation,
 * querying, and monitoring.
 * 
 * Usage:
 * - TAG_CALL_TRACKING: Core functionality, never cancelled
 * - TAG_USER_DATA_SYNC: Cancelled on logout
 * - TAG_BACKGROUND_SYNC: Periodic background operations
 */
object WorkerTags {
    // Category tags - broad classification
    const val TAG_CALL_TRACKING = "call_tracking"      // NEVER cancel these
    const val TAG_USER_DATA_SYNC = "user_data_sync"    // Cancel on logout
    const val TAG_BACKGROUND_SYNC = "background_sync"   // Periodic work
    
    // Specific worker tags - for fine-grained control
    const val TAG_CALL_LOG_INGESTION = "call_log_ingestion"
    const val TAG_RECORDING_FINDER = "recording_finder"
    const val TAG_SYNC_WORKER = "sync_worker"
    const val TAG_CALL_LOG_SYNC = "call_log_sync"
}
