package com.amplifyframework.devmenu;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.amplifyframework.util.Time;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ShakeDetector {
    private static final double SHAKE_THRESHOLD = 13.042844772338867d;
    private static final int SHAKE_TIME = 1000;
    private Sensor accelerometer;
    private final Listener listener;
    private final SensorEventListener sensorEventListener = new SensorEventListener() { // from class: com.amplifyframework.devmenu.ShakeDetector.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f6 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            if (Math.sqrt((f11 * f11) + (f10 * f10) + (f6 * f6)) > ShakeDetector.SHAKE_THRESHOLD) {
                long jNow = Time.now();
                if (ShakeDetector.this.shakeStart == 0) {
                    ShakeDetector.this.shakeStart = jNow;
                } else if (jNow - ShakeDetector.this.shakeStart > 1000) {
                    ShakeDetector.this.listener.onShakeDetected();
                    ShakeDetector.this.shakeStart = 0L;
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };
    private SensorManager sensorManager;
    private long shakeStart;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public interface Listener {
        void onShakeDetected();
    }

    public ShakeDetector(Context context, Listener listener) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        if (sensorManager != null) {
            this.accelerometer = sensorManager.getDefaultSensor(1);
        }
        this.listener = listener;
        this.shakeStart = 0L;
    }

    public void startDetecting() {
        Sensor sensor = this.accelerometer;
        if (sensor != null) {
            this.sensorManager.registerListener(this.sensorEventListener, sensor, 3);
        }
    }

    public void stopDetecting() {
        if (this.accelerometer != null) {
            this.sensorManager.unregisterListener(this.sensorEventListener);
        }
    }
}
