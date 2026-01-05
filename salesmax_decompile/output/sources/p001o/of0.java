package p001o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p001o.of0;

/* loaded from: classes6.dex */
public abstract class of0 {

    /* renamed from: a */
    public static final c5f f38268a = wve.m55086d(new Callable() { // from class: o.nf0
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return of0.C15788a.f38269a;
        }
    });

    /* renamed from: o.of0$a */
    public static final class C15788a {

        /* renamed from: a */
        public static final c5f f38269a = new tw7(new Handler(Looper.getMainLooper()), true);
    }

    /* renamed from: c */
    public static c5f m42164c() {
        return wve.m55087e(f38268a);
    }
}
