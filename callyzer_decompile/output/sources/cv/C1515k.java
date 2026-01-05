package cv;

import android.content.res.Resources;
import aws.smithy.kotlin.runtime.time.IncompleteException;
import aws.smithy.kotlin.runtime.time.ParseException;
import aws.smithy.kotlin.runtime.time.TakeWhileMNException;
import ev.C2136a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;
import sq.b1;
import sq.g2;
import td.AbstractC7136m;
import td.C7127d;
import td.C7129f;
import td.C7135l;
import w2.InterfaceC7879r;
import zq.AbstractC9018a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1515k implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7647a;

    /* renamed from: b */
    public final /* synthetic */ int f7648b;

    /* renamed from: c */
    public final /* synthetic */ int f7649c;

    /* renamed from: d */
    public final /* synthetic */ Object f7650d;

    public /* synthetic */ C1515k(int i10, int i11, int i12, InterfaceC2137a interfaceC2137a) {
        this.f7647a = 5;
        this.f7648b = i10;
        this.f7649c = i11;
        this.f7650d = interfaceC2137a;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        switch (this.f7647a) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC1505a.m5072l((C2136a) this.f7650d, this.f7648b, (InterfaceC3962k) obj, C3953b.m8496A(this.f7649c | 1));
                return a0.f30746a;
            case 1:
                ((Integer) obj2).getClass();
                g2.m13148Z(C3953b.m8496A(this.f7648b | 1), this.f7649c, (String) this.f7650d, (InterfaceC3962k) obj);
                return a0.f30746a;
            case 2:
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f7650d;
                ((Integer) obj2).getClass();
                b1.m13102f(this.f7648b, C3953b.m8496A(this.f7649c | 1), (InterfaceC3962k) obj, interfaceC7879r);
                return a0.f30746a;
            case 3:
                int i10 = this.f7648b;
                int i11 = this.f7649c;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f7650d;
                String str = (String) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                AbstractC4154l.m8923f(str, "str");
                AbstractC7136m.m13412b(iIntValue, 0, str);
                try {
                    C7129f c7129f = (C7129f) new C1515k(i11, i10, C7135l.f34369a).invoke(str, num);
                    int i12 = c7129f.f34349a;
                    C4266h c4266h = (C4266h) c7129f.f34350b;
                    if (c4266h.isEmpty()) {
                        throw new ParseException(str, "expected integer", iIntValue);
                    }
                    return new C7129f(i12, (Number) interfaceC2141e.invoke(str, c4266h));
                } catch (IncompleteException e2) {
                    throw new ParseException(str, AbstractC7136m.m13411a(i10, i11, i10, String.valueOf(e2.f3513b)), iIntValue);
                } catch (TakeWhileMNException e10) {
                    throw new ParseException(str, AbstractC7136m.m13411a(i10, i11, e10.f3514b, "found " + e10.f3515c), iIntValue);
                }
            case 4:
                ?? r02 = (AbstractC4152j) this.f7650d;
                String str2 = (String) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AbstractC4154l.m8923f(str2, "str");
                int i13 = this.f7648b;
                int i14 = this.f7649c;
                if (i13 < i14) {
                    throw new IllegalArgumentException(AbstractC5601a.m11235f("min m=", i14, i13, " cannot be greater than max=").toString());
                }
                AbstractC7136m.m13412b(iIntValue2, 0, str2);
                int i15 = iIntValue2;
                while (i15 < str2.length() && i15 - iIntValue2 < i13 && ((Boolean) r02.invoke(Character.valueOf(str2.charAt(i15)))).booleanValue()) {
                    i15++;
                }
                int i16 = i15 - iIntValue2;
                if (i16 >= i14) {
                    return new C7129f(i15, new C4266h(iIntValue2, i15 - 1, 1));
                }
                if (i15 >= str2.length()) {
                    throw new IncompleteException(str2, new C7127d(i14 - i16));
                }
                throw new TakeWhileMNException(str2, i15, i14, i16);
            default:
                ((Integer) obj2).getClass();
                AbstractC9018a.m16482b(this.f7648b, this.f7649c, C3953b.m8496A(1), (InterfaceC2137a) this.f7650d, (InterfaceC3962k) obj);
                return a0.f30746a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1515k(int i10, int i11, InterfaceC2139c interfaceC2139c) {
        this.f7647a = 4;
        this.f7648b = i10;
        this.f7649c = i11;
        this.f7650d = (AbstractC4152j) interfaceC2139c;
    }

    public /* synthetic */ C1515k(int i10, int i11, InterfaceC2141e interfaceC2141e) {
        this.f7647a = 3;
        this.f7648b = i10;
        this.f7649c = i11;
        this.f7650d = interfaceC2141e;
    }

    public /* synthetic */ C1515k(Object obj, int i10, int i11, int i12) {
        this.f7647a = i12;
        this.f7650d = obj;
        this.f7648b = i10;
        this.f7649c = i11;
    }
}
