package p7;

import androidx.constraintlayout.core.parser.CLParsingException;
import au.C0442f;
import c5.C0863a;
import c5.C0867e;
import c5.C0869g;
import c5.C0870h;
import c9.C0917l;
import c9.C0927v;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d7.q0;
import ex.InterfaceC2139c;
import g2.ka;
import g7.AbstractC2538c;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import l7.C4423w;
import l7.e0;
import l7.p0;
import mm.C4791b;
import nt.C5138b;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.iana.AEADAlgorithm;
import p7.C5836g;
import q7.C6135b;
import qr.C6299w;
import qw.a0;
import y4.C8540a;
import y4.C8541b;
import y4.C8543d;
import y4.C8545f;
import y4.C8546g;
import y4.C8550k;
import yb.InterfaceC8609a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p7.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C5835f implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f28529a;

    public /* synthetic */ C5835f(int i10) {
        this.f28529a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws CLParsingException {
        switch (this.f28529a) {
            case 0:
                AbstractC4154l.m8923f((AbstractC2538c) obj, "$this$initializer");
                return new C5836g.a();
            case 1:
                InterfaceC8609a it = (InterfaceC8609a) obj;
                AbstractC4154l.m8923f(it, "it");
                return it.getIdentifier();
            case 2:
                p0 popUpTo = (p0) obj;
                AbstractC4154l.m8923f(popUpTo, "$this$popUpTo");
                popUpTo.f22094a = true;
                return a0.f30746a;
            case 3:
                ((p0) obj).f22094a = true;
                return a0.f30746a;
            case 4:
                AbstractC4154l.m8923f((ka) obj, "it");
                return Boolean.FALSE;
            case 5:
                C5138b it2 = (C5138b) obj;
                AbstractC4154l.m8923f(it2, "it");
                return it2.f25171c;
            case 6:
                AbstractC2538c initializer = (AbstractC2538c) obj;
                AbstractC4154l.m8923f(initializer, "$this$initializer");
                return new C6135b(q0.m5335b(initializer));
            case 7:
                e0 navOptions = (e0) obj;
                AbstractC4154l.m8923f(navOptions, "$this$navOptions");
                navOptions.f22028c = true;
                return a0.f30746a;
            case 8:
                AbstractC4422v destination = (AbstractC4422v) obj;
                AbstractC4154l.m8923f(destination, "destination");
                C4423w c4423w = destination.f22136c;
                if (c4423w == null || c4423w.f22140g.f22763b != destination.f22135b.f29939e) {
                    return null;
                }
                return c4423w;
            case 9:
                AbstractC4422v destination2 = (AbstractC4422v) obj;
                AbstractC4154l.m8923f(destination2, "destination");
                C4423w c4423w2 = destination2.f22136c;
                if (c4423w2 == null || c4423w2.f22140g.f22763b != destination2.f22135b.f29939e) {
                    return null;
                }
                return c4423w2;
            case 10:
                AbstractC4422v it3 = (AbstractC4422v) obj;
                AbstractC4154l.m8923f(it3, "it");
                return Integer.valueOf(it3.f22135b.f29939e);
            case 11:
                C8545f c8545f = (C8545f) obj;
                C8541b c8541bM4574u = AbstractC1452a.m4574u(c8545f, "$this$ConstraintSet", "icon");
                C8541b c8541b = new C8541b(TextBundle.TEXT_ENTRY);
                c8545f.m15811b(c8541bM4574u, new C0442f(c8541b, 10));
                c8545f.m15811b(c8541b, new C5835f(14));
                return a0.f30746a;
            case 12:
                C8545f c8545f2 = (C8545f) obj;
                C8541b c8541bM4574u2 = AbstractC1452a.m4574u(c8545f2, "$this$ConstraintSet", "icon");
                C8541b c8541b2 = new C8541b(TextBundle.TEXT_ENTRY);
                c8545f2.m15811b(c8541bM4574u2, new C0442f(c8541b2, 9));
                c8545f2.m15811b(c8541b2, new C5835f(13));
                return a0.f30746a;
            case 13:
                C8540a constrain = (C8540a) obj;
                AbstractC4154l.m8923f(constrain, "$this$constrain");
                C0927v.m2699n(constrain.f41486c, constrain.f41485b.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                return a0.f30746a;
            case 14:
                C8540a constrain2 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain2, "$this$constrain");
                C0927v.m2699n(constrain2.f41486c, constrain2.f41485b.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                return a0.f30746a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C8545f c8545f3 = (C8545f) obj;
                C8541b c8541bM4574u3 = AbstractC1452a.m4574u(c8545f3, "$this$ConstraintSet", "view");
                C8541b c8541b3 = new C8541b("contentView");
                int i10 = c8545f3.f41504b;
                c8545f3.f41504b = i10 + 1;
                Integer numValueOf = Integer.valueOf(i10);
                C8550k c8550k = new C8550k(numValueOf);
                C0863a c0863a = new C0863a(new char[0]);
                c0863a.m2317m(C0870h.m2333m("start"));
                c0863a.m2317m(new C0867e(0.3f));
                C0869g c0869gM15810a = c8545f3.m15810a(c8550k);
                C0870h c0870h = new C0870h("vGuideline".toCharArray());
                c0870h.f5410b = 0L;
                c0870h.m2331k(9);
                c0869gM15810a.m2315E(TransferTable.COLUMN_TYPE, c0870h);
                c0869gM15810a.m2315E("percent", c0863a);
                Float.hashCode(0.3f);
                C8543d c8543d = new C8543d(numValueOf, 0, c8550k);
                c8545f3.m15811b(c8541bM4574u3, new C6299w(c8543d, 0));
                C8540a c8540a = new C8540a(c8541b3.f41492b, c8545f3.m15810a(c8541b3));
                C8540a.m15807a(c8540a, c8543d, c8540a.f41485b.f41495e);
                c8540a.m15808b(new C8546g("spread"));
                return a0.f30746a;
            case 16:
                C8540a constrain3 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain3, "$this$constrain");
                C0927v.m2699n(constrain3.f41486c, constrain3.f41485b.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                return a0.f30746a;
            case 17:
                C8545f c8545f4 = (C8545f) obj;
                C8541b c8541bM4574u4 = AbstractC1452a.m4574u(c8545f4, "$this$ConstraintSet", "icon");
                C8541b c8541b4 = new C8541b(TextBundle.TEXT_ENTRY);
                c8545f4.m15811b(c8541bM4574u4, new C0442f(c8541b4, 11));
                c8545f4.m15811b(c8541b4, new C5835f(16));
                return a0.f30746a;
            case 18:
                AbstractC4154l.m8923f((ka) obj, "it");
                return Boolean.FALSE;
            case 19:
                C8540a constrain4 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain4, "$this$constrain");
                C0917l c0917l = constrain4.f41487d;
                C8541b c8541b5 = constrain4.f41485b;
                C0917l.m2636k(c0917l, c8541b5.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain4.f41486c, c8541b5.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain4.f41488e, c8541b5.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                return a0.f30746a;
            case 20:
                C8540a constrain5 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain5, "$this$constrain");
                C0917l c0917l2 = constrain5.f41487d;
                C8541b c8541b6 = constrain5.f41485b;
                C0917l.m2636k(c0917l2, c8541b6.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain5.f41486c, c8541b6.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain5.f41488e, c8541b6.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                C0917l.m2636k(constrain5.f41489f, c8541b6.f41496f, DefinitionKt.NO_Float_VALUE, 6);
                return a0.f30746a;
            case 21:
                C8540a constrain6 = (C8540a) obj;
                AbstractC4154l.m8923f(constrain6, "$this$constrain");
                C0927v c0927v = constrain6.f41488e;
                C8541b c8541b7 = constrain6.f41485b;
                C0927v.m2699n(c0927v, c8541b7.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                C0917l.m2636k(constrain6.f41489f, c8541b7.f41496f, DefinitionKt.NO_Float_VALUE, 6);
                return a0.f30746a;
            case 22:
                C8545f c8545f5 = (C8545f) obj;
                C8541b c8541bM4574u5 = AbstractC1452a.m4574u(c8545f5, "$this$ConstraintSet", "info");
                C8541b c8541b8 = new C8541b("list");
                C8541b c8541b9 = new C8541b("log_file_send");
                c8545f5.m15811b(c8541bM4574u5, new C5835f(19));
                c8545f5.m15811b(c8541b8, new C5835f(20));
                c8545f5.m15811b(c8541b9, new C5835f(21));
                return a0.f30746a;
            case 23:
                C8545f c8545f6 = (C8545f) obj;
                final C8541b c8541bM4574u6 = AbstractC1452a.m4574u(c8545f6, "$this$ConstraintSet", "verificationTypeIcon");
                final C8541b c8541b10 = new C8541b("verificationTypeTitle");
                final C8541b c8541b11 = new C8541b("verificationRightArrow");
                C8541b c8541b12 = new C8541b("verificationTypeDescription");
                c8545f6.m15811b(c8541bM4574u6, new C0442f(c8541b10, 12));
                final int i11 = 0;
                c8545f6.m15811b(c8541b10, new InterfaceC2139c() { // from class: qv.n
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj2) {
                        C8540a constrain7 = (C8540a) obj2;
                        switch (i11) {
                            case 0:
                                AbstractC4154l.m8923f(constrain7, "$this$constrain");
                                float f6 = 10;
                                C0927v.m2699n(constrain7.f41486c, c8541bM4574u6.f41495e, f6, 4);
                                C0917l.m2636k(constrain7.f41487d, constrain7.f41485b.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                                C0927v.m2699n(constrain7.f41488e, c8541b11.f41493c, f6, 4);
                                constrain7.m15808b(new C8546g("spread"));
                                break;
                            default:
                                AbstractC4154l.m8923f(constrain7, "$this$constrain");
                                C0917l c0917l3 = constrain7.f41487d;
                                C8541b c8541b13 = c8541bM4574u6;
                                C0917l.m2636k(c0917l3, c8541b13.f41496f, 5, 4);
                                C0927v.m2699n(constrain7.f41486c, c8541b13.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                                C0927v.m2699n(constrain7.f41488e, c8541b11.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                                constrain7.m15808b(new C8546g("spread"));
                                break;
                        }
                        return a0.f30746a;
                    }
                });
                c8545f6.m15811b(c8541b11, new C0442f(c8541b10, 13));
                final int i12 = 1;
                c8545f6.m15811b(c8541b12, new InterfaceC2139c() { // from class: qv.n
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj2) {
                        C8540a constrain7 = (C8540a) obj2;
                        switch (i12) {
                            case 0:
                                AbstractC4154l.m8923f(constrain7, "$this$constrain");
                                float f6 = 10;
                                C0927v.m2699n(constrain7.f41486c, c8541b10.f41495e, f6, 4);
                                C0917l.m2636k(constrain7.f41487d, constrain7.f41485b.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                                C0927v.m2699n(constrain7.f41488e, c8541b11.f41493c, f6, 4);
                                constrain7.m15808b(new C8546g("spread"));
                                break;
                            default:
                                AbstractC4154l.m8923f(constrain7, "$this$constrain");
                                C0917l c0917l3 = constrain7.f41487d;
                                C8541b c8541b13 = c8541b10;
                                C0917l.m2636k(c0917l3, c8541b13.f41496f, 5, 4);
                                C0927v.m2699n(constrain7.f41486c, c8541b13.f41493c, DefinitionKt.NO_Float_VALUE, 6);
                                C0927v.m2699n(constrain7.f41488e, c8541b11.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                                constrain7.m15808b(new C8546g("spread"));
                                break;
                        }
                        return a0.f30746a;
                    }
                });
                return a0.f30746a;
            case 24:
                AbstractC4154l.m8923f((ka) obj, "it");
                return Boolean.FALSE;
            case 25:
                AbstractC4154l.m8923f((ka) obj, "it");
                return Boolean.FALSE;
            case 26:
                C4791b it4 = (C4791b) obj;
                AbstractC4154l.m8923f(it4, "it");
                return String.valueOf(it4.f23832a);
            case 27:
                C4791b it5 = (C4791b) obj;
                AbstractC4154l.m8923f(it5, "it");
                return String.valueOf(it5.f23832a);
            case 28:
                C4791b it6 = (C4791b) obj;
                AbstractC4154l.m8923f(it6, "it");
                return String.valueOf(it6.f23832a);
            default:
                ((Integer) obj).getClass();
                return a0.f30746a;
        }
    }
}
