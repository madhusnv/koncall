package hq;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.foundation.layout.AbstractC0242a;
import au.C0442f;
import c9.C0917l;
import c9.C0927v;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import ex.InterfaceC2139c;
import g1.C2438r;
import g1.o0;
import g7.AbstractC2538c;
import h1.AbstractC2773d;
import hy.C3050a;
import ix.AbstractC3363d;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4281m;
import ky.C4284p;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.C4413m;
import l7.C4423w;
import l7.p0;
import ly.AbstractC4600x;
import ly.C4599w;
import n7.C4956a;
import n7.C4963h;
import na.AbstractC4982d;
import nx.AbstractC5185w;
import org.bouncycastle.iana.AEADAlgorithm;
import pc.C5888p;
import qw.C6361k;
import w2.InterfaceC7879r;
import y4.C8540a;
import y4.C8541b;
import y4.C8545f;
import zh.AbstractC8954a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16170a;

    public /* synthetic */ d0(int i10) {
        this.f16170a = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object it) {
        int i10 = this.f16170a;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                InterfaceC7879r conditional = (InterfaceC7879r) it;
                AbstractC4154l.m8923f(conditional, "$this$conditional");
                return AbstractC0242a.m660n(conditional, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 20, DefinitionKt.NO_Float_VALUE, 11);
            case 1:
                AbstractC4154l.m8923f((String) it, "it");
                return a0Var;
            case 2:
                AbstractC4154l.m8923f((String) it, "<unused var>");
                return Boolean.TRUE;
            case 3:
                C3050a buildSerialDescriptor = (C3050a) it;
                AbstractC4154l.m8923f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                C3050a.m7276a(buildSerialDescriptor, "JsonPrimitive", new C4284p(new C3008m(21)));
                C3050a.m7276a(buildSerialDescriptor, "JsonNull", new C4284p(new C3008m(22)));
                C3050a.m7276a(buildSerialDescriptor, "JsonLiteral", new C4284p(new C3008m(23)));
                C3050a.m7276a(buildSerialDescriptor, "JsonObject", new C4284p(new C3008m(24)));
                C3050a.m7276a(buildSerialDescriptor, "JsonArray", new C4284p(new C3008m(25)));
                return a0Var;
            case 4:
                Map.Entry entry = (Map.Entry) it;
                AbstractC4154l.m8923f(entry, "<destruct>");
                String str = (String) entry.getKey();
                AbstractC4281m abstractC4281m = (AbstractC4281m) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                AbstractC4600x.m9474a(sb2, str);
                sb2.append(':');
                sb2.append(abstractC4281m);
                String string = sb2.toString();
                AbstractC4154l.m8922e(string, "toString(...)");
                return string;
            case 5:
                Context it2 = (Context) it;
                AbstractC4154l.m8923f(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 6:
                Context it3 = (Context) it;
                AbstractC4154l.m8923f(it3, "it");
                if (it3 instanceof ContextWrapper) {
                    return ((ContextWrapper) it3).getBaseContext();
                }
                return null;
            case 7:
                AbstractC2538c initializer = (AbstractC2538c) it;
                AbstractC4154l.m8923f(initializer, "$this$initializer");
                return new C4413m();
            case 8:
                Context it4 = (Context) it;
                AbstractC4154l.m8923f(it4, "it");
                ContextWrapper contextWrapper = it4 instanceof ContextWrapper ? (ContextWrapper) it4 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 9:
                Context it5 = (Context) it;
                AbstractC4154l.m8923f(it5, "it");
                if (it5 instanceof Activity) {
                    return (Activity) it5;
                }
                return null;
            case 10:
                AbstractC4422v it6 = (AbstractC4422v) it;
                AbstractC4154l.m8923f(it6, "it");
                return it6.f22136c;
            case 11:
                AbstractC4422v it7 = (AbstractC4422v) it;
                AbstractC4154l.m8923f(it7, "it");
                if (!(it7 instanceof C4423w)) {
                    return null;
                }
                C4599w c4599w = ((C4423w) it7).f22140g;
                return c4599w.m9463p(c4599w.f22763b);
            case 12:
                AbstractC4154l.m8923f((p0) it, "<this>");
                return a0Var;
            case 13:
                View it8 = (View) it;
                AbstractC4154l.m8923f(it8, "it");
                Object parent = it8.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 14:
                View it9 = (View) it;
                AbstractC4154l.m8923f(it9, "it");
                Object tag = it9.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (l7.a0) ((WeakReference) tag).get();
                }
                if (tag instanceof l7.a0) {
                    return (l7.a0) tag;
                }
                return null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                l7.e0 navOptions = (l7.e0) it;
                AbstractC4154l.m8923f(navOptions, "$this$navOptions");
                navOptions.f22027b = true;
                return a0Var;
            case 16:
                C8545f c8545f = (C8545f) it;
                C8541b c8541bM4574u = AbstractC1452a.m4574u(c8545f, "$this$ConstraintSet", "img");
                C8541b c8541b = new C8541b(IMAPStore.ID_NAME);
                c8545f.m15811b(c8541bM4574u, new d0(17));
                c8545f.m15811b(c8541b, new C0442f(c8541bM4574u, 8));
                return a0Var;
            case 17:
                C8540a constrain = (C8540a) it;
                AbstractC4154l.m8923f(constrain, "$this$constrain");
                C0917l c0917l = constrain.f41487d;
                C8541b c8541b2 = constrain.f41485b;
                C0917l.m2636k(c0917l, c8541b2.f41494d, DefinitionKt.NO_Float_VALUE, 6);
                C0927v.m2699n(constrain.f41488e, c8541b2.f41495e, DefinitionKt.NO_Float_VALUE, 6);
                C0917l.m2636k(constrain.f41489f, c8541b2.f41496f, DefinitionKt.NO_Float_VALUE, 6);
                return a0Var;
            case 18:
                ((Boolean) it).getClass();
                return a0Var;
            case 19:
                AbstractC4154l.m8923f(it, "it");
                return Integer.valueOf(AbstractC3363d.f17771a.m7677d(2147418112) + 65536);
            case 20:
                return Boolean.valueOf(it == null);
            case 21:
                return new C4956a(q0.m5335b((AbstractC2538c) it));
            case 22:
                return o0.m6091d(AbstractC2773d.m6795r(700, 0, null, 6), DefinitionKt.NO_Float_VALUE, 2);
            case 23:
                AbstractC4422v abstractC4422v = ((C4409i) ((C2438r) it).mo6100c()).f22046b;
                AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i11 = AbstractC4422v.f22133f;
                for (AbstractC4422v abstractC4422v2 : AbstractC8954a.m16436b((C4963h) abstractC4422v)) {
                }
                return null;
            case 24:
                return o0.m6092e(AbstractC2773d.m6795r(700, 0, null, 6), 2);
            case 25:
                return ((C4409i) it).f22050f;
            case 26:
                Map.Entry entry2 = (Map.Entry) it;
                AbstractC4154l.m8923f(entry2, "entry");
                String str2 = (String) entry2.getKey();
                Object value = entry2.getValue();
                return AbstractC4982d.m9897b("md", str2, (String) (AbstractC5185w.m10130l((String) value, "true", true) ? null : value));
            case 27:
                C5888p engineConstructor = (C5888p) it;
                AbstractC4154l.m8923f(engineConstructor, "$this$engineConstructor");
                return a0Var;
            case 28:
                C5888p engineConstructor2 = (C5888p) it;
                AbstractC4154l.m8923f(engineConstructor2, "$this$engineConstructor");
                return a0Var;
            default:
                C6361k it10 = (C6361k) it;
                AbstractC4154l.m8923f(it10, "it");
                return (String) it10.f30755a;
        }
    }
}
