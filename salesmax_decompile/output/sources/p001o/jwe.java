package p001o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jwe {

    /* renamed from: a */
    public static final jwe f31197a = new jwe();

    /* renamed from: b */
    public static final xk7 f31198b = C14675a.f31199a;

    /* renamed from: o.jwe$a */
    public static final class C14675a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14675a f31199a = new C14675a();

        public C14675a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Throwable th) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            return Boolean.valueOf((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof IOException));
        }
    }

    /* renamed from: o.jwe$b */
    public static final class C14676b implements jh1 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f31200a;

        /* renamed from: b */
        public final /* synthetic */ int f31201b;

        public C14676b(xk7 xk7Var, int i) {
            this.f31200a = xk7Var;
            this.f31201b = i;
        }

        /* renamed from: a */
        public final Integer m34633a(Throwable th, int i) {
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            boolean zBooleanValue = ((Boolean) this.f31200a.invoke(th)).booleanValue();
            if (i <= this.f31201b && zBooleanValue) {
                return Integer.valueOf(i);
            }
            throw new RuntimeException("Check Your Internet : Max retries: " + this.f31201b + " reached or retry condition met: " + zBooleanValue, th);
        }

        @Override // p001o.jh1
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return m34633a((Throwable) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: o.jwe$c */
    public static final class C14677c implements rl7 {

        /* renamed from: a */
        public final /* synthetic */ int f31202a;

        public C14677c(int i) {
            this.f31202a = i;
        }

        /* renamed from: a */
        public final x8c m34634a(int i) {
            return x6c.A0(i * this.f31202a, TimeUnit.MILLISECONDS);
        }

        @Override // p001o.rl7
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return m34634a(((Number) obj).intValue());
        }
    }

    /* renamed from: c */
    public static /* synthetic */ rl7 m34628c(jwe jweVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 10;
        }
        if ((i3 & 2) != 0) {
            i2 = 1000;
        }
        return jweVar.m34630b(i, i2);
    }

    /* renamed from: e */
    public static final x8c m34629e(int i, xk7 xk7Var, int i2, x6c x6cVar) {
        sq8.m48649h(xk7Var, "$condition");
        sq8.m48649h(x6cVar, "errors");
        return x6cVar.K0(x6c.k0(1, i + 1), new C14676b(xk7Var, i)).m55717M(new C14677c(i2));
    }

    /* renamed from: b */
    public final rl7 m34630b(int i, int i2) {
        return m34631d(i, i2, f31198b);
    }

    /* renamed from: d */
    public final rl7 m34631d(final int i, final int i2, final xk7 xk7Var) {
        sq8.m48649h(xk7Var, "condition");
        return new rl7() { // from class: o.iwe
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return jwe.m34629e(i, xk7Var, i2, (x6c) obj);
            }
        };
    }
}
