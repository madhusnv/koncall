package p001o;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import org.apache.http.message.TokenParser;
import p001o.b99;
import p001o.ca9;

/* loaded from: classes5.dex */
public class x89 extends erh {

    /* renamed from: q */
    public static final int f53342q = EnumC18074a.collectDefaults();

    /* renamed from: s */
    public static final int f53343s = ca9.EnumC12600a.collectDefaults();

    /* renamed from: x */
    public static final int f53344x = b99.EnumC12329a.collectDefaults();

    /* renamed from: y */
    public static final eff f53345y = cg5.f18129h;

    /* renamed from: a */
    public final transient rh2 f53346a;

    /* renamed from: b */
    public final transient lq1 f53347b;

    /* renamed from: c */
    public int f53348c;

    /* renamed from: d */
    public int f53349d;

    /* renamed from: e */
    public int f53350e;

    /* renamed from: f */
    public eff f53351f;

    /* renamed from: g */
    public int f53352g;

    /* renamed from: h */
    public final char f53353h;

    /* renamed from: o.x89$a */
    public enum EnumC18074a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        EnumC18074a(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (EnumC18074a enumC18074a : values()) {
                if (enumC18074a.enabledByDefault()) {
                    mask |= enumC18074a.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public x89() {
        this(null);
    }

    /* renamed from: A */
    public ca9 m55813A(String str) {
        int length = str.length();
        if (length > 32768 || !m55828m()) {
            return m55838z(new StringReader(str));
        }
        q68 q68VarM55816a = m55816a(str, true);
        char[] cArrM44851g = q68VarM55816a.m44851g(length);
        str.getChars(0, length, cArrM44851g, 0);
        return m55820e(cArrM44851g, 0, length, q68VarM55816a, true);
    }

    /* renamed from: B */
    public x89 m55814B(b99.EnumC12329a enumC12329a) {
        this.f53350e = (~enumC12329a.getMask()) & this.f53350e;
        return this;
    }

    /* renamed from: C */
    public x89 m55815C(b99.EnumC12329a enumC12329a) {
        this.f53350e = enumC12329a.getMask() | this.f53350e;
        return this;
    }

    /* renamed from: a */
    public q68 m55816a(Object obj, boolean z) {
        return new q68(m55827l(), obj, z);
    }

    /* renamed from: b */
    public b99 m55817b(Writer writer, q68 q68Var) {
        edj edjVar = new edj(q68Var, this.f53350e, null, writer, this.f53353h);
        int i = this.f53352g;
        if (i > 0) {
            edjVar.v0(i);
        }
        eff effVar = this.f53351f;
        if (effVar != f53345y) {
            edjVar.y0(effVar);
        }
        return edjVar;
    }

    /* renamed from: c */
    public ca9 m55818c(InputStream inputStream, q68 q68Var) {
        return new nq1(q68Var, inputStream).m40907c(this.f53349d, null, this.f53347b, this.f53346a, this.f53348c);
    }

    /* renamed from: d */
    public ca9 m55819d(Reader reader, q68 q68Var) {
        return new oce(q68Var, this.f53349d, reader, null, this.f53346a.m46758q(this.f53348c));
    }

    /* renamed from: e */
    public ca9 m55820e(char[] cArr, int i, int i2, q68 q68Var, boolean z) {
        return new oce(q68Var, this.f53349d, null, null, this.f53346a.m46758q(this.f53348c), cArr, i, i + i2, z);
    }

    /* renamed from: f */
    public b99 m55821f(OutputStream outputStream, q68 q68Var) {
        o1i o1iVar = new o1i(q68Var, this.f53350e, null, outputStream, this.f53353h);
        int i = this.f53352g;
        if (i > 0) {
            o1iVar.v0(i);
        }
        eff effVar = this.f53351f;
        if (effVar != f53345y) {
            o1iVar.y0(effVar);
        }
        return o1iVar;
    }

    /* renamed from: g */
    public Writer m55822g(OutputStream outputStream, s89 s89Var, q68 q68Var) {
        return s89Var == s89.UTF8 ? new q1i(q68Var, outputStream) : new OutputStreamWriter(outputStream, s89Var.getJavaName());
    }

    /* renamed from: h */
    public final InputStream m55823h(InputStream inputStream, q68 q68Var) {
        return inputStream;
    }

    /* renamed from: i */
    public final OutputStream m55824i(OutputStream outputStream, q68 q68Var) {
        return outputStream;
    }

    /* renamed from: j */
    public final Reader m55825j(Reader reader, q68 q68Var) {
        return reader;
    }

    /* renamed from: k */
    public final Writer m55826k(Writer writer, q68 q68Var) {
        return writer;
    }

    /* renamed from: l */
    public xl1 m55827l() {
        return EnumC18074a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this.f53348c) ? yl1.m57983a() : new xl1();
    }

    /* renamed from: m */
    public boolean m55828m() {
        return true;
    }

    /* renamed from: o */
    public final x89 m55829o(b99.EnumC12329a enumC12329a, boolean z) {
        return z ? m55815C(enumC12329a) : m55814B(enumC12329a);
    }

    /* renamed from: p */
    public b99 m55830p(OutputStream outputStream, s89 s89Var) {
        q68 q68VarM55816a = m55816a(outputStream, false);
        q68VarM55816a.m44862r(s89Var);
        return s89Var == s89.UTF8 ? m55821f(m55824i(outputStream, q68VarM55816a), q68VarM55816a) : m55817b(m55826k(m55822g(outputStream, s89Var, q68VarM55816a), q68VarM55816a), q68VarM55816a);
    }

    /* renamed from: q */
    public b99 m55831q(Writer writer) {
        q68 q68VarM55816a = m55816a(writer, false);
        return m55817b(m55826k(writer, q68VarM55816a), q68VarM55816a);
    }

    /* renamed from: r */
    public b99 m55832r(OutputStream outputStream, s89 s89Var) {
        return m55830p(outputStream, s89Var);
    }

    public Object readResolve() {
        return new x89(this, null);
    }

    /* renamed from: s */
    public b99 m55833s(Writer writer) {
        return m55831q(writer);
    }

    /* renamed from: t */
    public ca9 m55834t(InputStream inputStream) {
        return m55837y(inputStream);
    }

    /* renamed from: u */
    public ca9 m55835u(Reader reader) {
        return m55838z(reader);
    }

    /* renamed from: x */
    public ca9 m55836x(String str) {
        return m55813A(str);
    }

    /* renamed from: y */
    public ca9 m55837y(InputStream inputStream) {
        q68 q68VarM55816a = m55816a(inputStream, false);
        return m55818c(m55823h(inputStream, q68VarM55816a), q68VarM55816a);
    }

    /* renamed from: z */
    public ca9 m55838z(Reader reader) {
        q68 q68VarM55816a = m55816a(reader, false);
        return m55819d(m55825j(reader, q68VarM55816a), q68VarM55816a);
    }

    public x89(i6c i6cVar) {
        this.f53346a = rh2.m46747m();
        this.f53347b = lq1.m37694B();
        this.f53348c = f53342q;
        this.f53349d = f53343s;
        this.f53350e = f53344x;
        this.f53351f = f53345y;
        this.f53353h = TokenParser.DQUOTE;
    }

    public x89(x89 x89Var, i6c i6cVar) {
        this.f53346a = rh2.m46747m();
        this.f53347b = lq1.m37694B();
        this.f53348c = f53342q;
        this.f53349d = f53343s;
        this.f53350e = f53344x;
        this.f53351f = f53345y;
        this.f53348c = x89Var.f53348c;
        this.f53349d = x89Var.f53349d;
        this.f53350e = x89Var.f53350e;
        this.f53351f = x89Var.f53351f;
        this.f53352g = x89Var.f53352g;
        this.f53353h = x89Var.f53353h;
    }
}
