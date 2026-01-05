package mq;

import android.net.Uri;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import lq.C4507b;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24162a;

    /* renamed from: b */
    public int f24163b;

    /* renamed from: c */
    public final /* synthetic */ h0 f24164c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC4854v f24165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(h0 h0Var, AbstractC4854v abstractC4854v, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24162a = i10;
        this.f24164c = h0Var;
        this.f24165d = abstractC4854v;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24162a) {
            case 0:
                return new b0(this.f24164c, this.f24165d, interfaceC7559c, 0);
            default:
                return new b0(this.f24164c, this.f24165d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f24162a) {
        }
        return ((b0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws SecurityException, IOException, IllegalArgumentException {
        Object objM14480P;
        Object value;
        switch (this.f24162a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f24163b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    h0 h0Var = this.f24164c;
                    C7806h c7806h = h0Var.f24275p;
                    C4836d c4836d = (C4836d) this.f24165d;
                    String str = c4836d.f24191a;
                    String str2 = c4836d.f24192b;
                    int i11 = c4836d.f24193c;
                    String lowerCase = c4836d.f24194d.toLowerCase(Locale.ROOT);
                    AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
                    j0 j0Var = new j0(str, str2, i11, lowerCase.equals(h0Var.f24261b.getString(R.string.unknown)) ? "" : c4836d.f24194d);
                    this.f24163b = 1;
                    if (c7806h.mo14775g(j0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f24163b;
                h0 h0Var2 = this.f24164c;
                if (i12 == 0) {
                    od.m10798c(obj);
                    p020v.x0 x0Var = h0Var2.f24267h;
                    C4841i c4841i = (C4841i) this.f24165d;
                    int i13 = c4841i.f24286a;
                    Uri uri = c4841i.f24287b;
                    this.f24163b = 1;
                    objM14480P = x0Var.m14480P(i13, uri, this);
                    if (objM14480P == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM14480P = obj;
                }
                String str3 = (String) objM14480P;
                if (str3 == null || str3.length() == 0) {
                    tx.c0.m13502y(d7.q0.m5340g(h0Var2), null, null, new C4857y(h0Var2, null, 1), 3);
                } else {
                    m1 m1Var = h0Var2.f24285z;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C4507b.m9340a((C4507b) value, false, null, null, false, false, 0, null, str3, null, 1791)));
                }
                return qw.a0.f30746a;
        }
    }
}
