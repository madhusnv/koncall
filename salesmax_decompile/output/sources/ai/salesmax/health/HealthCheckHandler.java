package ai.salesmax.health;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class HealthCheckHandler {
    private static final String HEALTH_CHECK_ACTION = "ai.salesmax.health.HEALTH_CHECK";
    private static final Long HEALTH_CHECK_INTERVAL = 60000L;
    private static final String TAG = "HealthCheckHandler";
    private final Context context;
    private final Handler handler;
    private final AtomicBoolean lastHealthStatus = new AtomicBoolean(false);
    private final AtomicLong lastHealthStatusUpdatedAt = new AtomicLong(0);
    private final AtomicLong lastSubmittedRequestAt = new AtomicLong(0);

    public HealthCheckHandler(Context context) {
        this.context = context;
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        sendHealthCheck();
        handler.postDelayed(healthCheckRunnable(), HEALTH_CHECK_INTERVAL.longValue());
    }

    private Runnable healthCheckRunnable() {
        return new Runnable() { // from class: ai.salesmax.health.HealthCheckHandler.1
            @Override // java.lang.Runnable
            public void run() {
                HealthCheckHandler.this.sendHealthCheck();
                HealthCheckHandler.this.handler.postDelayed(this, HealthCheckHandler.HEALTH_CHECK_INTERVAL.longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendHealthCheck() {
        Intent intent = new Intent(HEALTH_CHECK_ACTION);
        intent.setPackage(this.context.getPackageName());
        this.context.sendBroadcast(intent);
        this.lastSubmittedRequestAt.set(System.currentTimeMillis());
    }

    public String healthCheckAction() {
        return HEALTH_CHECK_ACTION;
    }

    public Boolean healthStatus() {
        Boolean boolValueOf = Boolean.valueOf(this.lastHealthStatus.get() & (this.lastSubmittedRequestAt.get() - this.lastHealthStatusUpdatedAt.get() <= HEALTH_CHECK_INTERVAL.longValue() * 2));
        StringBuilder sb = new StringBuilder();
        sb.append("HealthCheck Status is: ");
        sb.append(boolValueOf);
        return boolValueOf;
    }

    public void lastHealthStatusUpdatedAt(Long l) {
        this.lastHealthStatusUpdatedAt.set(l.longValue());
    }

    public void updateHealthStatus(Boolean bool) {
        this.lastHealthStatus.set(bool.booleanValue());
    }
}
