package i00;

import a9.C0073l;
import iz.C3389v;
import iz.C3393z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: y */
    public static final Pattern f16688y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: z */
    public static final Pattern f16689z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    public final C0073l f16690a;

    /* renamed from: b */
    public final Class f16691b;

    /* renamed from: c */
    public final Method f16692c;

    /* renamed from: d */
    public final Annotation[] f16693d;

    /* renamed from: e */
    public final Annotation[][] f16694e;

    /* renamed from: f */
    public final Type[] f16695f;

    /* renamed from: g */
    public boolean f16696g;

    /* renamed from: h */
    public boolean f16697h;

    /* renamed from: i */
    public boolean f16698i;

    /* renamed from: j */
    public boolean f16699j;

    /* renamed from: k */
    public boolean f16700k;

    /* renamed from: l */
    public boolean f16701l;

    /* renamed from: m */
    public boolean f16702m;

    /* renamed from: n */
    public boolean f16703n;

    /* renamed from: o */
    public String f16704o;

    /* renamed from: p */
    public boolean f16705p;

    /* renamed from: q */
    public boolean f16706q;

    /* renamed from: r */
    public boolean f16707r;

    /* renamed from: s */
    public String f16708s;

    /* renamed from: t */
    public C3389v f16709t;

    /* renamed from: u */
    public C3393z f16710u;

    /* renamed from: v */
    public LinkedHashSet f16711v;

    /* renamed from: w */
    public w0[] f16712w;

    /* renamed from: x */
    public boolean f16713x;

    public n0(C0073l c0073l, Class cls, Method method) {
        this.f16690a = c0073l;
        this.f16691b = cls;
        this.f16692c = method;
        this.f16693d = method.getAnnotations();
        this.f16695f = method.getGenericParameterTypes();
        this.f16694e = method.getParameterAnnotations();
    }

    /* renamed from: a */
    public static Class m7453a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* renamed from: b */
    public final void m7454b(String str, String str2, boolean z6) {
        String str3 = this.f16704o;
        Method method = this.f16692c;
        if (str3 != null) {
            throw w0.m7473l(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f16704o = str;
        this.f16705p = z6;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f16688y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw w0.m7473l(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f16708s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f16711v = linkedHashSet;
    }

    /* renamed from: c */
    public final void m7455c(int i10, Type type) {
        if (w0.m7471j(type)) {
            throw w0.m7474m(this.f16692c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
