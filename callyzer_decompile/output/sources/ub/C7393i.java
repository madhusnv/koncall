package ub;

import a2.AbstractC0030c;
import an.j2;
import au.C0442f;
import b2.C0554l;
import c9.C0917l;
import c9.C0927v;
import cd.C0959n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording;
import com.websoptimization.callyzerbiz.data.model.response.CallLogResponse;
import com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse;
import d3.i0;
import ex.InterfaceC2139c;
import g2.ka;
import hq.d0;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import l7.e0;
import l7.p0;
import nx.AbstractC5178p;
import og.qe;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.a1;
import qm.C6250f;
import qr.C6299w;
import qw.a0;
import sw.C6964h;
import vx.C7806h;
import xd.AbstractC8337h;
import xm.w2;
import y4.C8540a;
import y4.C8541b;
import y4.C8543d;
import y4.C8545f;
import y4.C8546g;
import z0.C8840f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ub.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C7393i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f35157a;

    public /* synthetic */ C7393i(int i10) {
        this.f35157a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f35157a;
        int i11 = 1;
        int i12 = 6;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                String v10 = (String) obj;
                AbstractC4154l.m8923f(v10, "v");
                return AbstractC5178p.g0(v10).toString();
            case 1:
                return obj;
            case 2:
                return a0Var;
            case 3:
                ka it = (ka) obj;
                AbstractC4154l.m8923f(it, "it");
                return Boolean.FALSE;
            case 4:
                C8545f c8545f = (C8545f) obj;
                C8541b c8541bM4574u = AbstractC1452a.m4574u(c8545f, "$this$ConstraintSet", MessageBundle.TITLE_ENTRY);
                C8541b c8541b = new C8541b("value");
                C8543d c8543dM15812c = c8545f.m15812c(0.9f);
                C8543d c8543dM15812c2 = c8545f.m15812c(0.3f);
                C8540a c8540a = new C8540a(c8541bM4574u.f41492b, c8545f.m15810a(c8541bM4574u));
                C0927v.m2699n(c8540a.f41486c, c8543dM15812c, DefinitionKt.NO_Float_VALUE, 6);
                c8540a.m15808b(new C8546g("spread"));
                C0927v.m2699n(c8540a.f41488e, c8541b.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                c8545f.m15811b(c8541b, new C6299w(c8543dM15812c2, i11));
                return a0Var;
            case 5:
                ka it2 = (ka) obj;
                AbstractC4154l.m8923f(it2, "it");
                return Boolean.FALSE;
            case 6:
                C8540a constrain = (C8540a) obj;
                AbstractC4154l.m8923f(constrain, "$this$constrain");
                C0917l.m2636k(constrain.f41489f, constrain.f41485b.f41496f, DefinitionKt.NO_Float_VALUE, 6);
                return a0Var;
            case 7:
                C8545f c8545f2 = (C8545f) obj;
                C8541b c8541bM4574u2 = AbstractC1452a.m4574u(c8545f2, "$this$ConstraintSet", "img");
                C8541b c8541b2 = new C8541b("content");
                c8545f2.m15811b(c8541bM4574u2, new C0442f(c8541b2, 16));
                c8545f2.m15811b(c8541b2, new C7393i(i12));
                return a0Var;
            case 8:
                C8545f c8545f3 = (C8545f) obj;
                C8541b c8541bM4574u3 = AbstractC1452a.m4574u(c8545f3, "$this$ConstraintSet", "img");
                C8541b c8541b3 = new C8541b("content");
                c8545f3.m15811b(c8541bM4574u3, new C0442f(c8541b3, 17));
                c8545f3.m15811b(c8541b3, new C7393i(9));
                return a0Var;
            case 9:
                C8540a constrain2 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain2, "$this$constrain");
                C0917l.m2636k(constrain2.f41489f, constrain2.f41485b.f41496f, DefinitionKt.NO_Float_VALUE, 6);
                return a0Var;
            case 10:
                String it3 = (String) obj;
                AbstractC4154l.m8923f(it3, "it");
                return "'" + it3 + "'";
            case 11:
                SyncCallLogCallRecording it4 = (SyncCallLogCallRecording) obj;
                AbstractC4154l.m8923f(it4, "it");
                return it4.m4625b();
            case 12:
                String it5 = (String) obj;
                AbstractC4154l.m8923f(it5, "it");
                return a0Var;
            case 13:
                return a0Var;
            case 14:
                return (AbstractC8337h) obj;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                CallRecordingResponse it6 = (CallRecordingResponse) obj;
                AbstractC4154l.m8923f(it6, "it");
                return " >>> ";
            case 16:
                CallLogResponse it7 = (CallLogResponse) obj;
                AbstractC4154l.m8923f(it7, "it");
                return a1.m14335o(AbstractC0030c.m127r("toNUmber: ", it7.m4751g(), " > dateTime: ", it7.m4748d(), " > fromNumber: "), it7.m4749e(), " > callType: ", it7.m4747c());
            case 17:
                ((Integer) obj).getClass();
                C7806h c7806h = w2.f40960b;
                return a0Var;
            case 18:
                C6250f it8 = (C6250f) obj;
                AbstractC4154l.m8923f(it8, "it");
                return it8.f30292b;
            case 19:
                C8545f c8545f4 = (C8545f) obj;
                C8541b c8541bM4574u4 = AbstractC1452a.m4574u(c8545f4, "$this$ConstraintSet", "img");
                C8541b c8541b4 = new C8541b(IMAPStore.ID_NAME);
                c8545f4.m15811b(c8541bM4574u4, new C7393i(20));
                c8545f4.m15811b(c8541b4, new C0442f(c8541bM4574u4, 18));
                return a0Var;
            case 20:
                C8540a constrain3 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain3, "$this$constrain");
                C0917l c0917l = constrain3.f41487d;
                C8541b c8541b5 = constrain3.f41485b;
                C0917l.m2636k(c0917l, c8541b5.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain3.f41488e, c8541b5.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                C0917l.m2636k(constrain3.f41489f, c8541b5.f41496f, DefinitionKt.NO_Float_VALUE, 6);
                return a0Var;
            case 21:
                i0 graphicsLayer = (i0) obj;
                AbstractC4154l.m8923f(graphicsLayer, "$this$graphicsLayer");
                if (graphicsLayer.f7772s != 1) {
                    graphicsLayer.f7756a |= 32768;
                    graphicsLayer.f7772s = 1;
                }
                return a0Var;
            case 22:
                p0 popUpTo = (p0) obj;
                AbstractC4154l.m8923f(popUpTo, "$this$popUpTo");
                popUpTo.f22094a = true;
                return a0Var;
            case 23:
                p0 popUpTo2 = (p0) obj;
                AbstractC4154l.m8923f(popUpTo2, "$this$popUpTo");
                popUpTo2.f22094a = true;
                return a0Var;
            case 24:
                e0 navigate = (e0) obj;
                AbstractC4154l.m8923f(navigate, "$this$navigate");
                navigate.m9210a(0, new d0(12));
                return a0Var;
            case 25:
                String it9 = (String) obj;
                AbstractC4154l.m8923f(it9, "it");
                return a0Var;
            case 26:
                return C8840f.f42554b;
            case 27:
                InterfaceC4026c it10 = (InterfaceC4026c) obj;
                AbstractC4154l.m8923f(it10, "it");
                return Boolean.valueOf(it10.r0());
            case 28:
                InterfaceC4026c statement = (InterfaceC4026c) obj;
                AbstractC4154l.m8923f(statement, "statement");
                C6964h c6964h = new C6964h();
                while (statement.r0()) {
                    c6964h.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return qe.m10855a(c6964h);
            default:
                C0959n DslBuilderProperty = (C0959n) obj;
                AbstractC4154l.m8923f(DslBuilderProperty, "$this$DslBuilderProperty");
                C0554l c0554lMo2719f = DslBuilderProperty.mo2719f();
                c0554lMo2719f.getClass();
                return new j2(3, c0554lMo2719f);
        }
    }
}
