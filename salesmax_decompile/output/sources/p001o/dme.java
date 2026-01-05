package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.storage.ObjectMetadata;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001o.oob;
import p001o.qwc;
import p001o.wx7;
import retrofit2.C18795f;
import retrofit2.Converter;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* loaded from: classes6.dex */
public final class dme {

    /* renamed from: a */
    public final Method f20246a;

    /* renamed from: b */
    public final w48 f20247b;

    /* renamed from: c */
    public final String f20248c;

    /* renamed from: d */
    public final String f20249d;

    /* renamed from: e */
    public final wx7 f20250e;

    /* renamed from: f */
    public final y9b f20251f;

    /* renamed from: g */
    public final boolean f20252g;

    /* renamed from: h */
    public final boolean f20253h;

    /* renamed from: i */
    public final boolean f20254i;

    /* renamed from: j */
    public final qwc[] f20255j;

    /* renamed from: k */
    public final boolean f20256k;

    /* renamed from: o.dme$a */
    public static final class C12992a {

        /* renamed from: x */
        public static final Pattern f20257x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f20258y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C18795f f20259a;

        /* renamed from: b */
        public final Method f20260b;

        /* renamed from: c */
        public final Annotation[] f20261c;

        /* renamed from: d */
        public final Annotation[][] f20262d;

        /* renamed from: e */
        public final Type[] f20263e;

        /* renamed from: f */
        public boolean f20264f;

        /* renamed from: g */
        public boolean f20265g;

        /* renamed from: h */
        public boolean f20266h;

        /* renamed from: i */
        public boolean f20267i;

        /* renamed from: j */
        public boolean f20268j;

        /* renamed from: k */
        public boolean f20269k;

        /* renamed from: l */
        public boolean f20270l;

        /* renamed from: m */
        public boolean f20271m;

        /* renamed from: n */
        public String f20272n;

        /* renamed from: o */
        public boolean f20273o;

        /* renamed from: p */
        public boolean f20274p;

        /* renamed from: q */
        public boolean f20275q;

        /* renamed from: r */
        public String f20276r;

        /* renamed from: s */
        public wx7 f20277s;

        /* renamed from: t */
        public y9b f20278t;

        /* renamed from: u */
        public Set f20279u;

        /* renamed from: v */
        public qwc[] f20280v;

        /* renamed from: w */
        public boolean f20281w;

        public C12992a(C18795f c18795f, Method method) {
            this.f20259a = c18795f;
            this.f20260b = method;
            this.f20261c = method.getAnnotations();
            this.f20263e = method.getGenericParameterTypes();
            this.f20262d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class m23559a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: h */
        public static Set m23560h(String str) {
            Matcher matcher = f20257x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public dme m23561b() {
            for (Annotation annotation : this.f20261c) {
                m23564e(annotation);
            }
            if (this.f20272n == null) {
                throw lri.m37844m(this.f20260b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f20273o) {
                if (this.f20275q) {
                    throw lri.m37844m(this.f20260b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f20274p) {
                    throw lri.m37844m(this.f20260b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f20262d.length;
            this.f20280v = new qwc[length];
            int i = length - 1;
            int i2 = 0;
            while (i2 < length) {
                this.f20280v[i2] = m23565f(i2, this.f20263e[i2], this.f20262d[i2], i2 == i);
                i2++;
            }
            if (this.f20276r == null && !this.f20271m) {
                throw lri.m37844m(this.f20260b, "Missing either @%s URL or @Url parameter.", this.f20272n);
            }
            boolean z = this.f20274p;
            if (!z && !this.f20275q && !this.f20273o && this.f20266h) {
                throw lri.m37844m(this.f20260b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f20264f) {
                throw lri.m37844m(this.f20260b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f20275q || this.f20265g) {
                return new dme(this);
            }
            throw lri.m37844m(this.f20260b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        /* renamed from: c */
        public final wx7 m23562c(String[] strArr) {
            wx7.C17997a c17997a = new wx7.C17997a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw lri.m37844m(this.f20260b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f20278t = y9b.m57396c(strTrim);
                    } catch (IllegalArgumentException e) {
                        throw lri.m37845n(this.f20260b, e, "Malformed content type: %s", strTrim);
                    }
                } else {
                    c17997a.m55335a(strSubstring, strTrim);
                }
            }
            return c17997a.m55340f();
        }

        /* renamed from: d */
        public final void m23563d(String str, String str2, boolean z) {
            String str3 = this.f20272n;
            if (str3 != null) {
                throw lri.m37844m(this.f20260b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f20272n = str;
            this.f20273o = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f20257x.matcher(strSubstring).find()) {
                    throw lri.m37844m(this.f20260b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f20276r = str2;
            this.f20279u = m23560h(str2);
        }

        /* renamed from: e */
        public final void m23564e(Annotation annotation) {
            if (annotation instanceof DELETE) {
                m23563d("DELETE", ((DELETE) annotation).value(), false);
                return;
            }
            if (annotation instanceof GET) {
                m23563d("GET", ((GET) annotation).value(), false);
                return;
            }
            if (annotation instanceof HEAD) {
                m23563d("HEAD", ((HEAD) annotation).value(), false);
                return;
            }
            if (annotation instanceof PATCH) {
                m23563d("PATCH", ((PATCH) annotation).value(), true);
                return;
            }
            if (annotation instanceof POST) {
                m23563d("POST", ((POST) annotation).value(), true);
                return;
            }
            if (annotation instanceof PUT) {
                m23563d("PUT", ((PUT) annotation).value(), true);
                return;
            }
            if (annotation instanceof OPTIONS) {
                m23563d("OPTIONS", ((OPTIONS) annotation).value(), false);
                return;
            }
            if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                m23563d(http.method(), http.path(), http.hasBody());
                return;
            }
            if (annotation instanceof Headers) {
                String[] strArrValue = ((Headers) annotation).value();
                if (strArrValue.length == 0) {
                    throw lri.m37844m(this.f20260b, "@Headers annotation is empty.", new Object[0]);
                }
                this.f20277s = m23562c(strArrValue);
                return;
            }
            if (annotation instanceof Multipart) {
                if (this.f20274p) {
                    throw lri.m37844m(this.f20260b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f20275q = true;
            } else if (annotation instanceof FormUrlEncoded) {
                if (this.f20275q) {
                    throw lri.m37844m(this.f20260b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f20274p = true;
            }
        }

        /* renamed from: f */
        public final qwc m23565f(int i, Type type2, Annotation[] annotationArr, boolean z) {
            qwc qwcVar;
            if (annotationArr != null) {
                qwcVar = null;
                for (Annotation annotation : annotationArr) {
                    qwc qwcVarM23566g = m23566g(i, type2, annotationArr, annotation);
                    if (qwcVarM23566g != null) {
                        if (qwcVar != null) {
                            throw lri.m37846o(this.f20260b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        qwcVar = qwcVarM23566g;
                    }
                }
            } else {
                qwcVar = null;
            }
            if (qwcVar != null) {
                return qwcVar;
            }
            if (z) {
                try {
                    if (lri.m37839h(type2) == n64.class) {
                        this.f20281w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw lri.m37846o(this.f20260b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final qwc m23566g(int i, Type type2, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                m23568j(i, type2);
                if (this.f20271m) {
                    throw lri.m37846o(this.f20260b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f20267i) {
                    throw lri.m37846o(this.f20260b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f20268j) {
                    throw lri.m37846o(this.f20260b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f20269k) {
                    throw lri.m37846o(this.f20260b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f20270l) {
                    throw lri.m37846o(this.f20260b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f20276r != null) {
                    throw lri.m37846o(this.f20260b, i, "@Url cannot be used with @%s URL", this.f20272n);
                }
                this.f20271m = true;
                if (type2 == w48.class || type2 == String.class || type2 == URI.class || ((type2 instanceof Class) && "android.net.Uri".equals(((Class) type2).getName()))) {
                    return new qwc.C16481p(this.f20260b, i);
                }
                throw lri.m37846o(this.f20260b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof Path) {
                m23568j(i, type2);
                if (this.f20268j) {
                    throw lri.m37846o(this.f20260b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f20269k) {
                    throw lri.m37846o(this.f20260b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f20270l) {
                    throw lri.m37846o(this.f20260b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f20271m) {
                    throw lri.m37846o(this.f20260b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f20276r == null) {
                    throw lri.m37846o(this.f20260b, i, "@Path can only be used with relative url on @%s", this.f20272n);
                }
                this.f20267i = true;
                Path path = (Path) annotation;
                String strValue = path.value();
                m23567i(i, strValue);
                return new qwc.C16476k(this.f20260b, i, strValue, this.f20259a.m60265i(type2, annotationArr), path.encoded());
            }
            if (annotation instanceof Query) {
                m23568j(i, type2);
                Query query = (Query) annotation;
                String strValue2 = query.value();
                boolean zEncoded = query.encoded();
                Class clsM37839h = lri.m37839h(type2);
                this.f20268j = true;
                if (!Iterable.class.isAssignableFrom(clsM37839h)) {
                    if (!clsM37839h.isArray()) {
                        return new qwc.C16477l(strValue2, this.f20259a.m60265i(type2, annotationArr), zEncoded);
                    }
                    return new qwc.C16477l(strValue2, this.f20259a.m60265i(m23559a(clsM37839h.getComponentType()), annotationArr), zEncoded).m45882b();
                }
                if (type2 instanceof ParameterizedType) {
                    return new qwc.C16477l(strValue2, this.f20259a.m60265i(lri.m37838g(0, (ParameterizedType) type2), annotationArr), zEncoded).m45883c();
                }
                throw lri.m37846o(this.f20260b, i, clsM37839h.getSimpleName() + " must include generic type (e.g., " + clsM37839h.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryName) {
                m23568j(i, type2);
                boolean zEncoded2 = ((QueryName) annotation).encoded();
                Class clsM37839h2 = lri.m37839h(type2);
                this.f20269k = true;
                if (!Iterable.class.isAssignableFrom(clsM37839h2)) {
                    if (!clsM37839h2.isArray()) {
                        return new qwc.C16479n(this.f20259a.m60265i(type2, annotationArr), zEncoded2);
                    }
                    return new qwc.C16479n(this.f20259a.m60265i(m23559a(clsM37839h2.getComponentType()), annotationArr), zEncoded2).m45882b();
                }
                if (type2 instanceof ParameterizedType) {
                    return new qwc.C16479n(this.f20259a.m60265i(lri.m37838g(0, (ParameterizedType) type2), annotationArr), zEncoded2).m45883c();
                }
                throw lri.m37846o(this.f20260b, i, clsM37839h2.getSimpleName() + " must include generic type (e.g., " + clsM37839h2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof QueryMap) {
                m23568j(i, type2);
                Class clsM37839h3 = lri.m37839h(type2);
                this.f20270l = true;
                if (!Map.class.isAssignableFrom(clsM37839h3)) {
                    throw lri.m37846o(this.f20260b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM37840i = lri.m37840i(type2, clsM37839h3, Map.class);
                if (!(typeM37840i instanceof ParameterizedType)) {
                    throw lri.m37846o(this.f20260b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM37840i;
                Type typeM37838g = lri.m37838g(0, parameterizedType);
                if (String.class == typeM37838g) {
                    return new qwc.C16478m(this.f20260b, i, this.f20259a.m60265i(lri.m37838g(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                }
                throw lri.m37846o(this.f20260b, i, "@QueryMap keys must be of type String: " + typeM37838g, new Object[0]);
            }
            if (annotation instanceof Header) {
                m23568j(i, type2);
                String strValue3 = ((Header) annotation).value();
                Class clsM37839h4 = lri.m37839h(type2);
                if (!Iterable.class.isAssignableFrom(clsM37839h4)) {
                    if (!clsM37839h4.isArray()) {
                        return new qwc.C16471f(strValue3, this.f20259a.m60265i(type2, annotationArr));
                    }
                    return new qwc.C16471f(strValue3, this.f20259a.m60265i(m23559a(clsM37839h4.getComponentType()), annotationArr)).m45882b();
                }
                if (type2 instanceof ParameterizedType) {
                    return new qwc.C16471f(strValue3, this.f20259a.m60265i(lri.m37838g(0, (ParameterizedType) type2), annotationArr)).m45883c();
                }
                throw lri.m37846o(this.f20260b, i, clsM37839h4.getSimpleName() + " must include generic type (e.g., " + clsM37839h4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof HeaderMap) {
                if (type2 == wx7.class) {
                    return new qwc.C16473h(this.f20260b, i);
                }
                m23568j(i, type2);
                Class clsM37839h5 = lri.m37839h(type2);
                if (!Map.class.isAssignableFrom(clsM37839h5)) {
                    throw lri.m37846o(this.f20260b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeM37840i2 = lri.m37840i(type2, clsM37839h5, Map.class);
                if (!(typeM37840i2 instanceof ParameterizedType)) {
                    throw lri.m37846o(this.f20260b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM37840i2;
                Type typeM37838g2 = lri.m37838g(0, parameterizedType2);
                if (String.class == typeM37838g2) {
                    return new qwc.C16472g(this.f20260b, i, this.f20259a.m60265i(lri.m37838g(1, parameterizedType2), annotationArr));
                }
                throw lri.m37846o(this.f20260b, i, "@HeaderMap keys must be of type String: " + typeM37838g2, new Object[0]);
            }
            if (annotation instanceof Field) {
                m23568j(i, type2);
                if (!this.f20274p) {
                    throw lri.m37846o(this.f20260b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String strValue4 = field.value();
                boolean zEncoded3 = field.encoded();
                this.f20264f = true;
                Class clsM37839h6 = lri.m37839h(type2);
                if (!Iterable.class.isAssignableFrom(clsM37839h6)) {
                    if (!clsM37839h6.isArray()) {
                        return new qwc.C16469d(strValue4, this.f20259a.m60265i(type2, annotationArr), zEncoded3);
                    }
                    return new qwc.C16469d(strValue4, this.f20259a.m60265i(m23559a(clsM37839h6.getComponentType()), annotationArr), zEncoded3).m45882b();
                }
                if (type2 instanceof ParameterizedType) {
                    return new qwc.C16469d(strValue4, this.f20259a.m60265i(lri.m37838g(0, (ParameterizedType) type2), annotationArr), zEncoded3).m45883c();
                }
                throw lri.m37846o(this.f20260b, i, clsM37839h6.getSimpleName() + " must include generic type (e.g., " + clsM37839h6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof FieldMap) {
                m23568j(i, type2);
                if (!this.f20274p) {
                    throw lri.m37846o(this.f20260b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class clsM37839h7 = lri.m37839h(type2);
                if (!Map.class.isAssignableFrom(clsM37839h7)) {
                    throw lri.m37846o(this.f20260b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM37840i3 = lri.m37840i(type2, clsM37839h7, Map.class);
                if (!(typeM37840i3 instanceof ParameterizedType)) {
                    throw lri.m37846o(this.f20260b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM37840i3;
                Type typeM37838g3 = lri.m37838g(0, parameterizedType3);
                if (String.class == typeM37838g3) {
                    Converter converterM60265i = this.f20259a.m60265i(lri.m37838g(1, parameterizedType3), annotationArr);
                    this.f20264f = true;
                    return new qwc.C16470e(this.f20260b, i, converterM60265i, ((FieldMap) annotation).encoded());
                }
                throw lri.m37846o(this.f20260b, i, "@FieldMap keys must be of type String: " + typeM37838g3, new Object[0]);
            }
            if (!(annotation instanceof Part)) {
                if (annotation instanceof PartMap) {
                    m23568j(i, type2);
                    if (!this.f20275q) {
                        throw lri.m37846o(this.f20260b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f20265g = true;
                    Class clsM37839h8 = lri.m37839h(type2);
                    if (!Map.class.isAssignableFrom(clsM37839h8)) {
                        throw lri.m37846o(this.f20260b, i, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeM37840i4 = lri.m37840i(type2, clsM37839h8, Map.class);
                    if (!(typeM37840i4 instanceof ParameterizedType)) {
                        throw lri.m37846o(this.f20260b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM37840i4;
                    Type typeM37838g4 = lri.m37838g(0, parameterizedType4);
                    if (String.class == typeM37838g4) {
                        Type typeM37838g5 = lri.m37838g(1, parameterizedType4);
                        if (oob.C15856c.class.isAssignableFrom(lri.m37839h(typeM37838g5))) {
                            throw lri.m37846o(this.f20260b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new qwc.C16475j(this.f20260b, i, this.f20259a.m60263g(typeM37838g5, annotationArr, this.f20261c), ((PartMap) annotation).encoding());
                    }
                    throw lri.m37846o(this.f20260b, i, "@PartMap keys must be of type String: " + typeM37838g4, new Object[0]);
                }
                if (annotation instanceof Body) {
                    m23568j(i, type2);
                    if (this.f20274p || this.f20275q) {
                        throw lri.m37846o(this.f20260b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f20266h) {
                        throw lri.m37846o(this.f20260b, i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        Converter converterM60263g = this.f20259a.m60263g(type2, annotationArr, this.f20261c);
                        this.f20266h = true;
                        return new qwc.C16468c(this.f20260b, i, converterM60263g);
                    } catch (RuntimeException e) {
                        throw lri.m37847p(this.f20260b, e, i, "Unable to create @Body converter for %s", type2);
                    }
                }
                if (!(annotation instanceof Tag)) {
                    return null;
                }
                m23568j(i, type2);
                Class clsM37839h9 = lri.m37839h(type2);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    qwc qwcVar = this.f20280v[i2];
                    if ((qwcVar instanceof qwc.C16482q) && ((qwc.C16482q) qwcVar).f42537a.equals(clsM37839h9)) {
                        throw lri.m37846o(this.f20260b, i, "@Tag type " + clsM37839h9.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new qwc.C16482q(clsM37839h9);
            }
            m23568j(i, type2);
            if (!this.f20275q) {
                throw lri.m37846o(this.f20260b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            Part part = (Part) annotation;
            this.f20265g = true;
            String strValue5 = part.value();
            Class clsM37839h10 = lri.m37839h(type2);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsM37839h10)) {
                    if (clsM37839h10.isArray()) {
                        if (oob.C15856c.class.isAssignableFrom(clsM37839h10.getComponentType())) {
                            return qwc.C16480o.f42534a.m45882b();
                        }
                        throw lri.m37846o(this.f20260b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (oob.C15856c.class.isAssignableFrom(clsM37839h10)) {
                        return qwc.C16480o.f42534a;
                    }
                    throw lri.m37846o(this.f20260b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type2 instanceof ParameterizedType) {
                    if (oob.C15856c.class.isAssignableFrom(lri.m37839h(lri.m37838g(0, (ParameterizedType) type2)))) {
                        return qwc.C16480o.f42534a.m45883c();
                    }
                    throw lri.m37846o(this.f20260b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw lri.m37846o(this.f20260b, i, clsM37839h10.getSimpleName() + " must include generic type (e.g., " + clsM37839h10.getSimpleName() + "<String>)", new Object[0]);
            }
            wx7 wx7VarM55326r = wx7.m55326r(ObjectMetadata.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "Content-Transfer-Encoding", part.encoding());
            if (!Iterable.class.isAssignableFrom(clsM37839h10)) {
                if (!clsM37839h10.isArray()) {
                    if (oob.C15856c.class.isAssignableFrom(clsM37839h10)) {
                        throw lri.m37846o(this.f20260b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new qwc.C16474i(this.f20260b, i, wx7VarM55326r, this.f20259a.m60263g(type2, annotationArr, this.f20261c));
                }
                Class clsM23559a = m23559a(clsM37839h10.getComponentType());
                if (oob.C15856c.class.isAssignableFrom(clsM23559a)) {
                    throw lri.m37846o(this.f20260b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new qwc.C16474i(this.f20260b, i, wx7VarM55326r, this.f20259a.m60263g(clsM23559a, annotationArr, this.f20261c)).m45882b();
            }
            if (type2 instanceof ParameterizedType) {
                Type typeM37838g6 = lri.m37838g(0, (ParameterizedType) type2);
                if (oob.C15856c.class.isAssignableFrom(lri.m37839h(typeM37838g6))) {
                    throw lri.m37846o(this.f20260b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new qwc.C16474i(this.f20260b, i, wx7VarM55326r, this.f20259a.m60263g(typeM37838g6, annotationArr, this.f20261c)).m45883c();
            }
            throw lri.m37846o(this.f20260b, i, clsM37839h10.getSimpleName() + " must include generic type (e.g., " + clsM37839h10.getSimpleName() + "<String>)", new Object[0]);
        }

        /* renamed from: i */
        public final void m23567i(int i, String str) {
            if (!f20258y.matcher(str).matches()) {
                throw lri.m37846o(this.f20260b, i, "@Path parameter name must match %s. Found: %s", f20257x.pattern(), str);
            }
            if (!this.f20279u.contains(str)) {
                throw lri.m37846o(this.f20260b, i, "URL \"%s\" does not contain \"{%s}\".", this.f20276r, str);
            }
        }

        /* renamed from: j */
        public final void m23568j(int i, Type type2) {
            if (lri.m37841j(type2)) {
                throw lri.m37846o(this.f20260b, i, "Parameter type must not include a type variable or wildcard: %s", type2);
            }
        }
    }

    public dme(C12992a c12992a) {
        this.f20246a = c12992a.f20260b;
        this.f20247b = c12992a.f20259a.f58030c;
        this.f20248c = c12992a.f20272n;
        this.f20249d = c12992a.f20276r;
        this.f20250e = c12992a.f20277s;
        this.f20251f = c12992a.f20278t;
        this.f20252g = c12992a.f20273o;
        this.f20253h = c12992a.f20274p;
        this.f20254i = c12992a.f20275q;
        this.f20255j = c12992a.f20280v;
        this.f20256k = c12992a.f20281w;
    }

    /* renamed from: b */
    public static dme m23557b(C18795f c18795f, Method method) {
        return new C12992a(c18795f, method).m23561b();
    }

    /* renamed from: a */
    public ule m23558a(Object[] objArr) {
        qwc[] qwcVarArr = this.f20255j;
        int length = objArr.length;
        if (length != qwcVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + qwcVarArr.length + ")");
        }
        zle zleVar = new zle(this.f20248c, this.f20247b, this.f20249d, this.f20250e, this.f20251f, this.f20252g, this.f20253h, this.f20254i);
        if (this.f20256k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            qwcVarArr[i].mo45881a(zleVar, objArr[i]);
        }
        return zleVar.m59595k().m51768y(pv8.class, new pv8(this.f20246a, arrayList)).m51746b();
    }
}
