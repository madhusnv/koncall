package androidx.work;

import android.annotation.SuppressLint;
import androidx.work.impl.DefaultRunnableScheduler;
import com.google.android.gms.common.api.Api;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.hu3;

/* loaded from: classes2.dex */
public final class Configuration {

    @SuppressLint({"MinMaxConstant"})
    public static final int MIN_SCHEDULER_LIMIT = 20;
    final String mDefaultProcessName;
    final hu3 mExceptionHandler;
    final Executor mExecutor;
    final InputMergerFactory mInputMergerFactory;
    private final boolean mIsUsingDefaultTaskExecutor;
    final int mLoggingLevel;
    final int mMaxJobSchedulerId;
    final int mMaxSchedulerLimit;
    final int mMinJobSchedulerId;
    final RunnableScheduler mRunnableScheduler;
    final hu3 mSchedulingExceptionHandler;
    final Executor mTaskExecutor;
    final WorkerFactory mWorkerFactory;

    public static final class Builder {
        String mDefaultProcessName;
        hu3 mExceptionHandler;
        Executor mExecutor;
        InputMergerFactory mInputMergerFactory;
        int mLoggingLevel;
        int mMaxJobSchedulerId;
        int mMaxSchedulerLimit;
        int mMinJobSchedulerId;
        RunnableScheduler mRunnableScheduler;
        hu3 mSchedulingExceptionHandler;
        Executor mTaskExecutor;
        WorkerFactory mWorkerFactory;

        public Builder() {
            this.mLoggingLevel = 4;
            this.mMinJobSchedulerId = 0;
            this.mMaxJobSchedulerId = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.mMaxSchedulerLimit = 20;
        }

        public Configuration build() {
            return new Configuration(this);
        }

        public Builder setDefaultProcessName(String str) {
            this.mDefaultProcessName = str;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.mExecutor = executor;
            return this;
        }

        public Builder setInitializationExceptionHandler(final InitializationExceptionHandler initializationExceptionHandler) {
            Objects.requireNonNull(initializationExceptionHandler);
            this.mExceptionHandler = new hu3() { // from class: o.xq3
                @Override // p001o.hu3
                public final void accept(Object obj) {
                    initializationExceptionHandler.handleException((Throwable) obj);
                }
            };
            return this;
        }

        public Builder setInputMergerFactory(InputMergerFactory inputMergerFactory) {
            this.mInputMergerFactory = inputMergerFactory;
            return this;
        }

        public Builder setJobSchedulerJobIdRange(int i, int i2) {
            if (i2 - i < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.mMinJobSchedulerId = i;
            this.mMaxJobSchedulerId = i2;
            return this;
        }

        public Builder setMaxSchedulerLimit(int i) {
            if (i < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.mMaxSchedulerLimit = Math.min(i, 50);
            return this;
        }

        public Builder setMinimumLoggingLevel(int i) {
            this.mLoggingLevel = i;
            return this;
        }

        public Builder setRunnableScheduler(RunnableScheduler runnableScheduler) {
            this.mRunnableScheduler = runnableScheduler;
            return this;
        }

        public Builder setSchedulingExceptionHandler(hu3 hu3Var) {
            this.mSchedulingExceptionHandler = hu3Var;
            return this;
        }

        public Builder setTaskExecutor(Executor executor) {
            this.mTaskExecutor = executor;
            return this;
        }

        public Builder setWorkerFactory(WorkerFactory workerFactory) {
            this.mWorkerFactory = workerFactory;
            return this;
        }

        public Builder setInitializationExceptionHandler(hu3 hu3Var) {
            this.mExceptionHandler = hu3Var;
            return this;
        }

        public Builder(Configuration configuration) {
            this.mExecutor = configuration.mExecutor;
            this.mWorkerFactory = configuration.mWorkerFactory;
            this.mInputMergerFactory = configuration.mInputMergerFactory;
            this.mTaskExecutor = configuration.mTaskExecutor;
            this.mLoggingLevel = configuration.mLoggingLevel;
            this.mMinJobSchedulerId = configuration.mMinJobSchedulerId;
            this.mMaxJobSchedulerId = configuration.mMaxJobSchedulerId;
            this.mMaxSchedulerLimit = configuration.mMaxSchedulerLimit;
            this.mRunnableScheduler = configuration.mRunnableScheduler;
            this.mExceptionHandler = configuration.mExceptionHandler;
            this.mSchedulingExceptionHandler = configuration.mSchedulingExceptionHandler;
            this.mDefaultProcessName = configuration.mDefaultProcessName;
        }
    }

    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(Builder builder) {
        Executor executor = builder.mExecutor;
        if (executor == null) {
            this.mExecutor = createDefaultExecutor(false);
        } else {
            this.mExecutor = executor;
        }
        Executor executor2 = builder.mTaskExecutor;
        if (executor2 == null) {
            this.mIsUsingDefaultTaskExecutor = true;
            this.mTaskExecutor = createDefaultExecutor(true);
        } else {
            this.mIsUsingDefaultTaskExecutor = false;
            this.mTaskExecutor = executor2;
        }
        WorkerFactory workerFactory = builder.mWorkerFactory;
        if (workerFactory == null) {
            this.mWorkerFactory = WorkerFactory.getDefaultWorkerFactory();
        } else {
            this.mWorkerFactory = workerFactory;
        }
        InputMergerFactory inputMergerFactory = builder.mInputMergerFactory;
        if (inputMergerFactory == null) {
            this.mInputMergerFactory = InputMergerFactory.getDefaultInputMergerFactory();
        } else {
            this.mInputMergerFactory = inputMergerFactory;
        }
        RunnableScheduler runnableScheduler = builder.mRunnableScheduler;
        if (runnableScheduler == null) {
            this.mRunnableScheduler = new DefaultRunnableScheduler();
        } else {
            this.mRunnableScheduler = runnableScheduler;
        }
        this.mLoggingLevel = builder.mLoggingLevel;
        this.mMinJobSchedulerId = builder.mMinJobSchedulerId;
        this.mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
        this.mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
        this.mExceptionHandler = builder.mExceptionHandler;
        this.mSchedulingExceptionHandler = builder.mSchedulingExceptionHandler;
        this.mDefaultProcessName = builder.mDefaultProcessName;
    }

    private Executor createDefaultExecutor(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), createDefaultThreadFactory(z));
    }

    private ThreadFactory createDefaultThreadFactory(final boolean z) {
        return new ThreadFactory() { // from class: androidx.work.Configuration.1
            private final AtomicInteger mThreadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, (z ? "WM.task-" : "androidx.work-") + this.mThreadCount.incrementAndGet());
            }
        };
    }

    public String getDefaultProcessName() {
        return this.mDefaultProcessName;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public hu3 getInitializationExceptionHandler() {
        return this.mExceptionHandler;
    }

    public InputMergerFactory getInputMergerFactory() {
        return this.mInputMergerFactory;
    }

    public int getMaxJobSchedulerId() {
        return this.mMaxJobSchedulerId;
    }

    public int getMaxSchedulerLimit() {
        return this.mMaxSchedulerLimit;
    }

    public int getMinJobSchedulerId() {
        return this.mMinJobSchedulerId;
    }

    public int getMinimumLoggingLevel() {
        return this.mLoggingLevel;
    }

    public RunnableScheduler getRunnableScheduler() {
        return this.mRunnableScheduler;
    }

    public hu3 getSchedulingExceptionHandler() {
        return this.mSchedulingExceptionHandler;
    }

    public Executor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    public boolean isUsingDefaultTaskExecutor() {
        return this.mIsUsingDefaultTaskExecutor;
    }
}
