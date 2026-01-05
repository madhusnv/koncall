package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class p89 implements sa9 {

    /* renamed from: a */
    public final boolean f39583a;

    /* renamed from: b */
    public final StringBuilder f39584b = new StringBuilder();

    /* renamed from: c */
    public final List f39585c = ch3.m21252q(yba.Initial);

    /* renamed from: d */
    public int f39586d;

    /* renamed from: o.p89$a */
    public /* synthetic */ class C16023a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39587a;

        static {
            int[] iArr = new int[yba.values().length];
            try {
                iArr[yba.ArrayFirstValueOrEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yba.ArrayNextValueOrEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yba.ObjectFieldValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39587a = iArr;
        }
    }

    public p89(boolean z) {
        this.f39583a = z;
    }

    @Override // p001o.sa9
    /* renamed from: a */
    public byte[] mo43171a() {
        String string = this.f39584b.toString();
        sq8.m48648g(string, "toString(...)");
        return e9g.m24603u(string);
    }

    @Override // p001o.sa9
    /* renamed from: b */
    public void mo43172b(Number number) {
        sq8.m48649h(number, "value");
        m43187q(number);
    }

    @Override // p001o.sa9
    public void beginArray() {
        m43182l("[", yba.ArrayFirstValueOrEnd);
    }

    @Override // p001o.sa9
    public void beginObject() {
        m43182l("{", yba.ObjectFirstKeyOrEnd);
    }

    @Override // p001o.sa9
    /* renamed from: c */
    public void mo43173c(int i) {
        m43187q(Integer.valueOf(i));
    }

    @Override // p001o.sa9
    /* renamed from: d */
    public void mo43174d(boolean z) {
        m43181k(String.valueOf(z));
    }

    @Override // p001o.sa9
    /* renamed from: e */
    public void mo43175e(float f) {
        m43187q(Float.valueOf(f));
    }

    @Override // p001o.sa9
    public void endArray() {
        m43180j("]", yba.ArrayFirstValueOrEnd, yba.ArrayNextValueOrEnd);
    }

    @Override // p001o.sa9
    public void endObject() {
        m43180j("}", yba.ObjectFirstKeyOrEnd, yba.ObjectNextKeyOrEnd);
    }

    @Override // p001o.sa9
    /* renamed from: f */
    public void mo43176f() {
        m43181k("null");
    }

    @Override // p001o.sa9
    /* renamed from: g */
    public void mo43177g(String str) {
        sq8.m48649h(str, "name");
        if (t2g.m49209e(this.f39585c) == yba.ObjectNextKeyOrEnd) {
            m43184n();
        }
        m43185o();
        m43179i(this.f39584b, r89.m46340a(str));
        t2g.m49208d(this.f39585c, yba.ObjectFieldValue);
    }

    @Override // p001o.sa9
    /* renamed from: h */
    public void mo43178h(String str) {
        sq8.m48649h(str, "value");
        m43181k(TokenParser.DQUOTE + r89.m46340a(str) + TokenParser.DQUOTE);
    }

    /* renamed from: i */
    public final void m43179i(StringBuilder sb, String str) {
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        sb.append(str);
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    /* renamed from: j */
    public final void m43180j(String str, yba... ybaVarArr) {
        m43186p();
        this.f39586d--;
        m43185o();
        this.f39584b.append(str);
        yba ybaVar = (yba) t2g.m49205a(this.f39585c);
        if (gp0.m29251R(ybaVarArr, ybaVar)) {
            return;
        }
        throw new IllegalStateException(("Invalid JSON encoder state " + ybaVar + "; expected one of " + gp0.r0(ybaVarArr, null, null, null, 0, null, null, 63, null)).toString());
    }

    /* renamed from: k */
    public final void m43181k(String str) {
        int i = C16023a.f39587a[((yba) t2g.m49209e(this.f39585c)).ordinal()];
        if (i == 1) {
            t2g.m49208d(this.f39585c, yba.ArrayNextValueOrEnd);
            m43185o();
        } else if (i == 2) {
            m43184n();
            m43185o();
        } else if (i == 3) {
            m43183m();
            t2g.m49208d(this.f39585c, yba.ObjectNextKeyOrEnd);
        }
        this.f39584b.append(str);
    }

    /* renamed from: l */
    public final void m43182l(String str, yba ybaVar) {
        m43181k(str);
        m43186p();
        this.f39586d++;
        t2g.m49207c(this.f39585c, ybaVar);
    }

    /* renamed from: m */
    public final void m43183m() {
        this.f39584b.append(":");
        if (this.f39583a) {
            this.f39584b.append(" ");
        }
    }

    /* renamed from: n */
    public final void m43184n() {
        this.f39584b.append(",");
        m43186p();
    }

    /* renamed from: o */
    public final void m43185o() {
        int i;
        if (!this.f39583a || (i = this.f39586d) <= 0) {
            return;
        }
        this.f39584b.append(e9g.m24589C(" ", i * 4));
    }

    /* renamed from: p */
    public final void m43186p() {
        if (this.f39583a) {
            this.f39584b.append('\n');
        }
    }

    /* renamed from: q */
    public final void m43187q(Number number) {
        m43181k(number.toString());
    }
}
