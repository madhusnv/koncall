package sf;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import mm.AbstractC4801l;
import pf.C5902b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends com.google.android.gms.internal.measurement.h0 {

    /* renamed from: b */
    public final /* synthetic */ AbstractC6819e f32372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AbstractC6819e abstractC6819e, Looper looper) {
        super(looper, 4);
        this.f32372b = abstractC6819e;
    }

    @Override // com.google.android.gms.internal.measurement.h0, android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Boolean bool;
        if (this.f32372b.f32402z.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                AbstractC6834t abstractC6834t = (AbstractC6834t) message.obj;
                abstractC6834t.getClass();
                abstractC6834t.m13027c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !this.f32372b.m12997c()) {
            AbstractC6834t abstractC6834t2 = (AbstractC6834t) message.obj;
            abstractC6834t2.getClass();
            abstractC6834t2.m13027c();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            AbstractC6819e abstractC6819e = this.f32372b;
            abstractC6819e.f32399w = new C5902b(message.arg2);
            if (!abstractC6819e.f32400x && !TextUtils.isEmpty(abstractC6819e.mo7592u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC6819e.mo7592u());
                    AbstractC6819e abstractC6819e2 = this.f32372b;
                    if (!abstractC6819e2.f32400x) {
                        abstractC6819e2.m13010z(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC6819e abstractC6819e3 = this.f32372b;
            C5902b c5902b = abstractC6819e3.f32399w;
            if (c5902b == null) {
                c5902b = new C5902b(8);
            }
            abstractC6819e3.f32389k.mo85a(c5902b);
            System.currentTimeMillis();
            return;
        }
        if (i12 == 5) {
            AbstractC6819e abstractC6819e4 = this.f32372b;
            C5902b c5902b2 = abstractC6819e4.f32399w;
            if (c5902b2 == null) {
                c5902b2 = new C5902b(8);
            }
            abstractC6819e4.f32389k.mo85a(c5902b2);
            System.currentTimeMillis();
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            this.f32372b.f32389k.mo85a(new C5902b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i12 == 6) {
            this.f32372b.m13010z(5, null);
            InterfaceC6816b interfaceC6816b = this.f32372b.f32394q;
            if (interfaceC6816b != null) {
                interfaceC6816b.mo12990f(message.arg2);
            }
            System.currentTimeMillis();
            AbstractC6819e.m12995y(this.f32372b, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f32372b.m13001g()) {
            AbstractC6834t abstractC6834t3 = (AbstractC6834t) message.obj;
            abstractC6834t3.getClass();
            abstractC6834t3.m13027c();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", AbstractC4801l.m9730d(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        AbstractC6834t abstractC6834t4 = (AbstractC6834t) message.obj;
        synchronized (abstractC6834t4) {
            try {
                bool = abstractC6834t4.f32492a;
                if (abstractC6834t4.f32493b) {
                    abstractC6834t4.toString();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            AbstractC6819e abstractC6819e5 = abstractC6834t4.f32497f;
            int i14 = abstractC6834t4.f32495d;
            if (i14 != 0) {
                abstractC6819e5.m13010z(1, null);
                Bundle bundle = abstractC6834t4.f32496e;
                abstractC6834t4.mo12993a(new C5902b(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!abstractC6834t4.mo12994b()) {
                abstractC6819e5.m13010z(1, null);
                abstractC6834t4.mo12993a(new C5902b(8, null));
            }
        }
        synchronized (abstractC6834t4) {
            abstractC6834t4.f32493b = true;
        }
        abstractC6834t4.m13027c();
    }
}
