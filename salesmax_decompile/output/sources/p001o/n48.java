package p001o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p001o.bt1;
import p001o.lri;
import retrofit2.C18795f;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes6.dex */
public abstract class n48 extends ngf {

    /* renamed from: a */
    public final dme f36356a;

    /* renamed from: b */
    public final bt1.InterfaceC12488a f36357b;

    /* renamed from: c */
    public final Converter f36358c;

    /* renamed from: o.n48$a */
    public static final class C15487a extends n48 {

        /* renamed from: d */
        public final CallAdapter f36359d;

        public C15487a(dme dmeVar, bt1.InterfaceC12488a interfaceC12488a, Converter converter, CallAdapter callAdapter) {
            super(dmeVar, interfaceC12488a, converter);
            this.f36359d = callAdapter;
        }

        @Override // p001o.n48
        /* renamed from: c */
        public Object mo40057c(Call call, Object[] objArr) {
            return this.f36359d.adapt(call);
        }
    }

    /* renamed from: o.n48$b */
    public static final class C15488b extends n48 {

        /* renamed from: d */
        public final CallAdapter f36360d;

        /* renamed from: e */
        public final boolean f36361e;

        public C15488b(dme dmeVar, bt1.InterfaceC12488a interfaceC12488a, Converter converter, CallAdapter callAdapter, boolean z) {
            super(dmeVar, interfaceC12488a, converter);
            this.f36360d = callAdapter;
            this.f36361e = z;
        }

        @Override // p001o.n48
        /* renamed from: c */
        public Object mo40057c(Call call, Object[] objArr) {
            Call call2 = (Call) this.f36360d.adapt(call);
            n64 n64Var = (n64) objArr[objArr.length - 1];
            try {
                return this.f36361e ? pe9.m43516b(call2, n64Var) : pe9.m43515a(call2, n64Var);
            } catch (Exception e) {
                return pe9.m43518d(e, n64Var);
            }
        }
    }

    /* renamed from: o.n48$c */
    public static final class C15489c extends n48 {

        /* renamed from: d */
        public final CallAdapter f36362d;

        public C15489c(dme dmeVar, bt1.InterfaceC12488a interfaceC12488a, Converter converter, CallAdapter callAdapter) {
            super(dmeVar, interfaceC12488a, converter);
            this.f36362d = callAdapter;
        }

        @Override // p001o.n48
        /* renamed from: c */
        public Object mo40057c(Call call, Object[] objArr) {
            Call call2 = (Call) this.f36362d.adapt(call);
            n64 n64Var = (n64) objArr[objArr.length - 1];
            try {
                return pe9.m43517c(call2, n64Var);
            } catch (Exception e) {
                return pe9.m43518d(e, n64Var);
            }
        }
    }

    public n48(dme dmeVar, bt1.InterfaceC12488a interfaceC12488a, Converter converter) {
        this.f36356a = dmeVar;
        this.f36357b = interfaceC12488a;
        this.f36358c = converter;
    }

    /* renamed from: d */
    public static CallAdapter m40053d(C18795f c18795f, Method method, Type type2, Annotation[] annotationArr) {
        try {
            return c18795f.m60257a(type2, annotationArr);
        } catch (RuntimeException e) {
            throw lri.m37845n(method, e, "Unable to create call adapter for %s", type2);
        }
    }

    /* renamed from: e */
    public static Converter m40054e(C18795f c18795f, Method method, Type type2) {
        try {
            return c18795f.m60264h(type2, method.getAnnotations());
        } catch (RuntimeException e) {
            throw lri.m37845n(method, e, "Unable to create converter for %s", type2);
        }
    }

    /* renamed from: f */
    public static n48 m40055f(C18795f c18795f, Method method, dme dmeVar) {
        Type genericReturnType;
        boolean z;
        boolean z2 = dmeVar.f20256k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM37837f = lri.m37837f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (lri.m37839h(typeM37837f) == bre.class && (typeM37837f instanceof ParameterizedType)) {
                typeM37837f = lri.m37838g(0, (ParameterizedType) typeM37837f);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new lri.C15146b(null, Call.class, typeM37837f);
            annotations = nvf.m41181a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        CallAdapter callAdapterM40053d = m40053d(c18795f, method, genericReturnType, annotations);
        Type typeResponseType = callAdapterM40053d.responseType();
        if (typeResponseType == zqe.class) {
            throw lri.m37844m(method, "'" + lri.m37839h(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeResponseType == bre.class) {
            throw lri.m37844m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (dmeVar.f20248c.equals("HEAD") && !Void.class.equals(typeResponseType)) {
            throw lri.m37844m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        Converter converterM40054e = m40054e(c18795f, method, typeResponseType);
        bt1.InterfaceC12488a interfaceC12488a = c18795f.f58029b;
        return !z2 ? new C15487a(dmeVar, interfaceC12488a, converterM40054e, callAdapterM40053d) : z ? new C15489c(dmeVar, interfaceC12488a, converterM40054e, callAdapterM40053d) : new C15488b(dmeVar, interfaceC12488a, converterM40054e, callAdapterM40053d, false);
    }

    @Override // p001o.ngf
    /* renamed from: a */
    public final Object mo40056a(Object[] objArr) {
        return mo40057c(new fac(this.f36356a, objArr, this.f36357b, this.f36358c), objArr);
    }

    /* renamed from: c */
    public abstract Object mo40057c(Call call, Object[] objArr);
}
