package p001o;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class vj7 {

    /* renamed from: a */
    public final C17602b f50440a;

    /* renamed from: o.vj7$a */
    public static class C17601a extends C17602b {

        /* renamed from: e */
        public static HandlerThread f50441e;

        /* renamed from: f */
        public static Handler f50442f;

        /* renamed from: a */
        public int f50443a;

        /* renamed from: b */
        public SparseIntArray[] f50444b = new SparseIntArray[9];

        /* renamed from: c */
        public final ArrayList f50445c = new ArrayList();

        /* renamed from: d */
        public Window.OnFrameMetricsAvailableListener f50446d = new a();

        /* renamed from: o.vj7$a$a */
        public class a implements Window.OnFrameMetricsAvailableListener {
            public a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C17601a c17601a = C17601a.this;
                if ((c17601a.f50443a & 1) != 0) {
                    c17601a.m52889e(c17601a.f50444b[0], frameMetrics.getMetric(8));
                }
                C17601a c17601a2 = C17601a.this;
                if ((c17601a2.f50443a & 2) != 0) {
                    c17601a2.m52889e(c17601a2.f50444b[1], frameMetrics.getMetric(1));
                }
                C17601a c17601a3 = C17601a.this;
                if ((c17601a3.f50443a & 4) != 0) {
                    c17601a3.m52889e(c17601a3.f50444b[2], frameMetrics.getMetric(3));
                }
                C17601a c17601a4 = C17601a.this;
                if ((c17601a4.f50443a & 8) != 0) {
                    c17601a4.m52889e(c17601a4.f50444b[3], frameMetrics.getMetric(4));
                }
                C17601a c17601a5 = C17601a.this;
                if ((c17601a5.f50443a & 16) != 0) {
                    c17601a5.m52889e(c17601a5.f50444b[4], frameMetrics.getMetric(5));
                }
                C17601a c17601a6 = C17601a.this;
                if ((c17601a6.f50443a & 64) != 0) {
                    c17601a6.m52889e(c17601a6.f50444b[6], frameMetrics.getMetric(7));
                }
                C17601a c17601a7 = C17601a.this;
                if ((c17601a7.f50443a & 32) != 0) {
                    c17601a7.m52889e(c17601a7.f50444b[5], frameMetrics.getMetric(6));
                }
                C17601a c17601a8 = C17601a.this;
                if ((c17601a8.f50443a & 128) != 0) {
                    c17601a8.m52889e(c17601a8.f50444b[7], frameMetrics.getMetric(0));
                }
                C17601a c17601a9 = C17601a.this;
                if ((c17601a9.f50443a & 256) != 0) {
                    c17601a9.m52889e(c17601a9.f50444b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C17601a(int i) {
            this.f50443a = i;
        }

        @Override // p001o.vj7.C17602b
        /* renamed from: a */
        public void mo52885a(Activity activity) {
            if (f50441e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f50441e = handlerThread;
                handlerThread.start();
                f50442f = new Handler(f50441e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f50444b;
                if (sparseIntArrayArr[i] == null && (this.f50443a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f50446d, f50442f);
            this.f50445c.add(new WeakReference(activity));
        }

        @Override // p001o.vj7.C17602b
        /* renamed from: b */
        public SparseIntArray[] mo52886b() {
            return this.f50444b;
        }

        @Override // p001o.vj7.C17602b
        /* renamed from: c */
        public SparseIntArray[] mo52887c(Activity activity) {
            Iterator it = this.f50445c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f50445c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f50446d);
            return this.f50444b;
        }

        @Override // p001o.vj7.C17602b
        /* renamed from: d */
        public SparseIntArray[] mo52888d() {
            SparseIntArray[] sparseIntArrayArr = this.f50444b;
            this.f50444b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: e */
        public void m52889e(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: o.vj7$b */
    public static class C17602b {
        /* renamed from: a */
        public abstract void mo52885a(Activity activity);

        /* renamed from: b */
        public abstract SparseIntArray[] mo52886b();

        /* renamed from: c */
        public abstract SparseIntArray[] mo52887c(Activity activity);

        /* renamed from: d */
        public abstract SparseIntArray[] mo52888d();
    }

    public vj7() {
        this(1);
    }

    /* renamed from: a */
    public void m52881a(Activity activity) {
        this.f50440a.mo52885a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m52882b() {
        return this.f50440a.mo52886b();
    }

    /* renamed from: c */
    public SparseIntArray[] m52883c(Activity activity) {
        return this.f50440a.mo52887c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m52884d() {
        return this.f50440a.mo52888d();
    }

    public vj7(int i) {
        this.f50440a = new C17601a(i);
    }
}
