package mq;

import android.content.Context;
import bu.C0782a;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.y8;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import xm.q4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.y */
/* loaded from: classes3.dex */
public final class C4857y extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24353a;

    /* renamed from: b */
    public final /* synthetic */ h0 f24354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4857y(h0 h0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24353a = i10;
        this.f24354b = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24353a) {
            case 0:
                return new C4857y(this.f24354b, interfaceC7559c, 0);
            case 1:
                return new C4857y(this.f24354b, interfaceC7559c, 1);
            case 2:
                return new C4857y(this.f24354b, interfaceC7559c, 2);
            default:
                return new C4857y(this.f24354b, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24353a) {
            case 0:
                C4857y c4857y = (C4857y) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c4857y.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C4857y c4857y2 = (C4857y) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c4857y2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                C4857y c4857y3 = (C4857y) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c4857y3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                C4857y c4857y4 = (C4857y) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c4857y4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f24353a;
        qw.a0 a0Var = qw.a0.f30746a;
        h0 h0Var = this.f24354b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                h0Var.f24260H = true;
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = h0Var.f24261b;
                String string = context.getString(R.string.recording_being_processed);
                AbstractC4154l.m8922e(string, "getString(...)");
                y8.m11950e(context, string);
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context2 = h0Var.f24261b;
                AbstractC5601a.m11254y(context2, R.string.subscription_expired, "getString(...)", context2);
                break;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                q4 q4Var = h0Var.f24270k.f22367a;
                tx.c0.m13502y(q4Var.f40743c, null, null, new C0782a(q4Var, null, 29), 3);
                break;
        }
        return a0Var;
    }
}
