package v7;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v7.b */
/* loaded from: classes.dex */
public final class C7684b extends AbstractC7685c {
    /* JADX WARN: Illegal instructions before constructor call */
    public C7684b(Context context, int i10) {
        switch (i10) {
            case 1:
                AbstractC4154l.m8923f(context, "context");
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                AbstractC4154l.m8922e(systemService, "context.getSystemService…ementManager::class.java)");
                super((MeasurementManager) systemService);
                break;
            default:
                AbstractC4154l.m8923f(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                AbstractC4154l.m8922e(measurementManager, "get(context)");
                super(measurementManager);
                break;
        }
    }
}
