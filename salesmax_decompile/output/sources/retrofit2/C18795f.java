package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p001o.bt1;
import p001o.hac;
import p001o.ngf;
import p001o.w48;
import retrofit2.C18790a;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: retrofit2.f */
/* loaded from: classes6.dex */
public final class C18795f {

    /* renamed from: a */
    public final Map f58028a = new ConcurrentHashMap();

    /* renamed from: b */
    public final bt1.InterfaceC12488a f58029b;

    /* renamed from: c */
    public final w48 f58030c;

    /* renamed from: d */
    public final List f58031d;

    /* renamed from: e */
    public final List f58032e;

    /* renamed from: f */
    public final Executor f58033f;

    /* renamed from: g */
    public final boolean f58034g;

    /* renamed from: retrofit2.f$a */
    public class a implements InvocationHandler {

        /* renamed from: a */
        public final C18794e f58035a = C18794e.m60250f();

        /* renamed from: b */
        public final Object[] f58036b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f58037c;

        public a(Class cls) {
            this.f58037c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f58036b;
            }
            return this.f58035a.m60256h(method) ? this.f58035a.mo60255g(method, this.f58037c, obj, objArr) : C18795f.this.m60259c(method).mo40056a(objArr);
        }
    }

    public C18795f(bt1.InterfaceC12488a interfaceC12488a, w48 w48Var, List list, List list2, Executor executor, boolean z) {
        this.f58029b = interfaceC12488a;
        this.f58030c = w48Var;
        this.f58031d = list;
        this.f58032e = list2;
        this.f58033f = executor;
        this.f58034g = z;
    }

    /* renamed from: a */
    public CallAdapter m60257a(Type type2, Annotation[] annotationArr) {
        return m60260d(null, type2, annotationArr);
    }

    /* renamed from: b */
    public Object m60258b(Class cls) throws SecurityException {
        m60266j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* renamed from: c */
    public ngf m60259c(Method method) {
        ngf ngfVarM40548b;
        ngf ngfVar = (ngf) this.f58028a.get(method);
        if (ngfVar != null) {
            return ngfVar;
        }
        synchronized (this.f58028a) {
            ngfVarM40548b = (ngf) this.f58028a.get(method);
            if (ngfVarM40548b == null) {
                ngfVarM40548b = ngf.m40548b(this, method);
                this.f58028a.put(method, ngfVarM40548b);
            }
        }
        return ngfVarM40548b;
    }

    /* renamed from: d */
    public CallAdapter m60260d(CallAdapter.AbstractC18788a abstractC18788a, Type type2, Annotation[] annotationArr) {
        Objects.requireNonNull(type2, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f58032e.indexOf(abstractC18788a) + 1;
        int size = this.f58032e.size();
        for (int i = iIndexOf; i < size; i++) {
            CallAdapter callAdapterMo60229a = ((CallAdapter.AbstractC18788a) this.f58032e.get(i)).mo60229a(type2, annotationArr, this);
            if (callAdapterMo60229a != null) {
                return callAdapterMo60229a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type2);
        sb.append(".\n");
        if (abstractC18788a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((CallAdapter.AbstractC18788a) this.f58032e.get(i2)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f58032e.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((CallAdapter.AbstractC18788a) this.f58032e.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public Converter m60261e(Converter.AbstractC18789a abstractC18789a, Type type2, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type2, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f58031d.indexOf(abstractC18789a) + 1;
        int size = this.f58031d.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter converterMo60232c = ((Converter.AbstractC18789a) this.f58031d.get(i)).mo60232c(type2, annotationArr, annotationArr2, this);
            if (converterMo60232c != null) {
                return converterMo60232c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type2);
        sb.append(".\n");
        if (abstractC18789a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((Converter.AbstractC18789a) this.f58031d.get(i2)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f58031d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.AbstractC18789a) this.f58031d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public Converter m60262f(Converter.AbstractC18789a abstractC18789a, Type type2, Annotation[] annotationArr) {
        Objects.requireNonNull(type2, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f58031d.indexOf(abstractC18789a) + 1;
        int size = this.f58031d.size();
        for (int i = iIndexOf; i < size; i++) {
            Converter converterMo60233d = ((Converter.AbstractC18789a) this.f58031d.get(i)).mo60233d(type2, annotationArr, this);
            if (converterMo60233d != null) {
                return converterMo60233d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type2);
        sb.append(".\n");
        if (abstractC18789a != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((Converter.AbstractC18789a) this.f58031d.get(i2)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f58031d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.AbstractC18789a) this.f58031d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public Converter m60263g(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return m60261e(null, type2, annotationArr, annotationArr2);
    }

    /* renamed from: h */
    public Converter m60264h(Type type2, Annotation[] annotationArr) {
        return m60262f(null, type2, annotationArr);
    }

    /* renamed from: i */
    public Converter m60265i(Type type2, Annotation[] annotationArr) {
        Objects.requireNonNull(type2, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f58031d.size();
        for (int i = 0; i < size; i++) {
            Converter converterM60234e = ((Converter.AbstractC18789a) this.f58031d.get(i)).m60234e(type2, annotationArr, this);
            if (converterM60234e != null) {
                return converterM60234e;
            }
        }
        return C18790a.d.f58003a;
    }

    /* renamed from: j */
    public final void m60266j(Class cls) throws SecurityException {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f58034g) {
            C18794e c18794eM60250f = C18794e.m60250f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!c18794eM60250f.m60256h(method) && !Modifier.isStatic(method.getModifiers())) {
                    m60259c(method);
                }
            }
        }
    }

    /* renamed from: retrofit2.f$b */
    public static final class b {

        /* renamed from: a */
        public final C18794e f58039a;

        /* renamed from: b */
        public bt1.InterfaceC12488a f58040b;

        /* renamed from: c */
        public w48 f58041c;

        /* renamed from: d */
        public final List f58042d;

        /* renamed from: e */
        public final List f58043e;

        /* renamed from: f */
        public Executor f58044f;

        /* renamed from: g */
        public boolean f58045g;

        public b(C18794e c18794e) {
            this.f58042d = new ArrayList();
            this.f58043e = new ArrayList();
            this.f58039a = c18794e;
        }

        /* renamed from: a */
        public b m60267a(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m60268b(w48.m53869g(str));
        }

        /* renamed from: b */
        public b m60268b(w48 w48Var) {
            Objects.requireNonNull(w48Var, "baseUrl == null");
            if ("".equals(w48Var.m53881m().get(r0.size() - 1))) {
                this.f58041c = w48Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + w48Var);
        }

        /* renamed from: c */
        public C18795f m60269c() {
            if (this.f58041c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            bt1.InterfaceC12488a hacVar = this.f58040b;
            if (hacVar == null) {
                hacVar = new hac();
            }
            bt1.InterfaceC12488a interfaceC12488a = hacVar;
            Executor executorMo60252b = this.f58044f;
            if (executorMo60252b == null) {
                executorMo60252b = this.f58039a.mo60252b();
            }
            Executor executor = executorMo60252b;
            ArrayList arrayList = new ArrayList(this.f58043e);
            arrayList.addAll(this.f58039a.m60251a(executor));
            ArrayList arrayList2 = new ArrayList(this.f58042d.size() + 1 + this.f58039a.m60254d());
            arrayList2.add(new C18790a());
            arrayList2.addAll(this.f58042d);
            arrayList2.addAll(this.f58039a.m60253c());
            return new C18795f(interfaceC12488a, this.f58041c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f58045g);
        }

        public b() {
            this(C18794e.m60250f());
        }
    }
}
