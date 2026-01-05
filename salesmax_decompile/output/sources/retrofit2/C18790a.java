package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p001o.cre;
import p001o.lri;
import p001o.xle;
import p001o.y3i;
import retrofit2.Converter;
import retrofit2.http.Streaming;

/* renamed from: retrofit2.a */
/* loaded from: classes6.dex */
public final class C18790a extends Converter.AbstractC18789a {

    /* renamed from: a */
    public boolean f57999a = true;

    /* renamed from: retrofit2.a$a */
    public static final class a implements Converter {

        /* renamed from: a */
        public static final a f58000a = new a();

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public cre convert(cre creVar) {
            try {
                return lri.m37832a(creVar);
            } finally {
                creVar.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    public static final class b implements Converter {

        /* renamed from: a */
        public static final b f58001a = new b();

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public xle convert(xle xleVar) {
            return xleVar;
        }
    }

    /* renamed from: retrofit2.a$c */
    public static final class c implements Converter {

        /* renamed from: a */
        public static final c f58002a = new c();

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public cre convert(cre creVar) {
            return creVar;
        }
    }

    /* renamed from: retrofit2.a$d */
    public static final class d implements Converter {

        /* renamed from: a */
        public static final d f58003a = new d();

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    public static final class e implements Converter {

        /* renamed from: a */
        public static final e f58004a = new e();

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y3i convert(cre creVar) {
            creVar.close();
            return y3i.f54824a;
        }
    }

    /* renamed from: retrofit2.a$f */
    public static final class f implements Converter {

        /* renamed from: a */
        public static final f f58005a = new f();

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(cre creVar) {
            creVar.close();
            return null;
        }
    }

    @Override // retrofit2.Converter.AbstractC18789a
    /* renamed from: c */
    public Converter mo60232c(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, C18795f c18795f) {
        if (xle.class.isAssignableFrom(lri.m37839h(type2))) {
            return b.f58001a;
        }
        return null;
    }

    @Override // retrofit2.Converter.AbstractC18789a
    /* renamed from: d */
    public Converter mo60233d(Type type2, Annotation[] annotationArr, C18795f c18795f) {
        if (type2 == cre.class) {
            return lri.m37843l(annotationArr, Streaming.class) ? c.f58002a : a.f58000a;
        }
        if (type2 == Void.class) {
            return f.f58005a;
        }
        if (!this.f57999a || type2 != y3i.class) {
            return null;
        }
        try {
            return e.f58004a;
        } catch (NoClassDefFoundError unused) {
            this.f57999a = false;
            return null;
        }
    }
}
