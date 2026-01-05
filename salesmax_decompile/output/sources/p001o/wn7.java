package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p001o.fbj;
import p001o.fu6;
import p001o.no0;
import p001o.r8;
import p001o.scb;
import p001o.yn8;

/* loaded from: classes6.dex */
public abstract class wn7 extends r8 {
    private static Map<Object, wn7> defaultInstanceMap = new ConcurrentHashMap();
    protected l4i unknownFields = l4i.m36562c();
    protected int memoizedSerializedSize = -1;

    /* renamed from: o.wn7$a */
    public static abstract class AbstractC17934a extends r8.AbstractC16551a {
        private final wn7 defaultInstance;
        protected wn7 instance;
        protected boolean isBuilt = false;

        public AbstractC17934a(wn7 wn7Var) {
            this.defaultInstance = wn7Var;
            this.instance = (wn7) wn7Var.dynamicMethod(EnumC17940g.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: c */
        public final void m54735c(wn7 wn7Var, wn7 wn7Var2) {
            v1e.m52231a().m52235e(wn7Var).mo40122a(wn7Var, wn7Var2);
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            wn7 wn7Var = (wn7) this.instance.dynamicMethod(EnumC17940g.NEW_MUTABLE_INSTANCE);
            m54735c(wn7Var, this.instance);
            this.instance = wn7Var;
        }

        @Override // p001o.tcb
        public final boolean isInitialized() {
            return wn7.isInitialized(this.instance, false);
        }

        @Override // p001o.scb.InterfaceC16809a
        public final wn7 build() {
            wn7 wn7VarBuildPartial = buildPartial();
            if (wn7VarBuildPartial.isInitialized()) {
                return wn7VarBuildPartial;
            }
            throw r8.AbstractC16551a.newUninitializedMessageException(wn7VarBuildPartial);
        }

        @Override // p001o.scb.InterfaceC16809a
        public wn7 buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final AbstractC17934a clear() {
            this.instance = (wn7) this.instance.dynamicMethod(EnumC17940g.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // p001o.tcb
        public wn7 getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // p001o.r8.AbstractC16551a
        public AbstractC17934a internalMergeFrom(wn7 wn7Var) {
            return mergeFrom(wn7Var);
        }

        /* renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public AbstractC17934a m69043clone() {
            AbstractC17934a abstractC17934aNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            abstractC17934aNewBuilderForType.mergeFrom(buildPartial());
            return abstractC17934aNewBuilderForType;
        }

        public AbstractC17934a mergeFrom(wn7 wn7Var) {
            copyOnWrite();
            m54735c(this.instance, wn7Var);
            return this;
        }

        @Override // p001o.r8.AbstractC16551a
        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC17934a m69047mergeFrom(byte[] bArr, int i, int i2, qp6 qp6Var) throws ct8 {
            copyOnWrite();
            try {
                v1e.m52231a().m52235e(this.instance).mo40130i(this.instance, bArr, i, i + i2, new no0.C15617b(qp6Var));
                return this;
            } catch (IndexOutOfBoundsException unused) {
                throw ct8.m21773m();
            } catch (ct8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        @Override // p001o.r8.AbstractC16551a
        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC17934a m69046mergeFrom(byte[] bArr, int i, int i2) {
            return m69047mergeFrom(bArr, i, i2, qp6.m45750c());
        }

        @Override // p001o.r8.AbstractC16551a
        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC17934a m69045mergeFrom(jf3 jf3Var, qp6 qp6Var) throws IOException {
            copyOnWrite();
            try {
                v1e.m52231a().m52235e(this.instance).mo40129h(this.instance, kf3.m35569P(jf3Var), qp6Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* renamed from: o.wn7$b */
    public static class C17935b extends b9 {

        /* renamed from: b */
        public final wn7 f52378b;

        public C17935b(wn7 wn7Var) {
            this.f52378b = wn7Var;
        }
    }

    /* renamed from: o.wn7$c */
    public static abstract class AbstractC17936c extends AbstractC17934a implements tcb {
        public AbstractC17936c(AbstractC17937d abstractC17937d) {
            super(abstractC17937d);
        }

        @Override // p001o.wn7.AbstractC17934a
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            wn7 wn7Var = this.instance;
            ((AbstractC17937d) wn7Var).extensions = ((AbstractC17937d) wn7Var).extensions.clone();
        }

        @Override // p001o.wn7.AbstractC17934a, p001o.scb.InterfaceC16809a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final AbstractC17937d buildPartial() {
            if (this.isBuilt) {
                return (AbstractC17937d) this.instance;
            }
            ((AbstractC17937d) this.instance).extensions.m27510t();
            return (AbstractC17937d) super.buildPartial();
        }
    }

    /* renamed from: o.wn7$d */
    public static abstract class AbstractC17937d extends wn7 implements tcb {
        protected fu6 extensions = fu6.m27493h();

        /* renamed from: g */
        public fu6 m54737g() {
            if (this.extensions.m27507o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // p001o.wn7, p001o.tcb
        public /* bridge */ /* synthetic */ scb getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // p001o.wn7, p001o.scb
        public /* bridge */ /* synthetic */ scb.InterfaceC16809a newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // p001o.wn7, p001o.scb
        public /* bridge */ /* synthetic */ scb.InterfaceC16809a toBuilder() {
            return super.toBuilder();
        }
    }

    /* renamed from: o.wn7$e */
    public static final class C17938e implements fu6.InterfaceC13557b {

        /* renamed from: a */
        public final yn8.InterfaceC18440d f52379a;

        /* renamed from: b */
        public final int f52380b;

        /* renamed from: c */
        public final fbj.EnumC13396b f52381c;

        /* renamed from: d */
        public final boolean f52382d;

        /* renamed from: e */
        public final boolean f52383e;

        public C17938e(yn8.InterfaceC18440d interfaceC18440d, int i, fbj.EnumC13396b enumC13396b, boolean z, boolean z2) {
            this.f52379a = interfaceC18440d;
            this.f52380b = i;
            this.f52381c = enumC13396b;
            this.f52382d = z;
            this.f52383e = z2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C17938e c17938e) {
            return this.f52380b - c17938e.f52380b;
        }

        /* renamed from: c */
        public yn8.InterfaceC18440d m54739c() {
            return this.f52379a;
        }

        @Override // p001o.fu6.InterfaceC13557b
        /* renamed from: f */
        public scb.InterfaceC16809a mo27515f(scb.InterfaceC16809a interfaceC16809a, scb scbVar) {
            return ((AbstractC17934a) interfaceC16809a).mergeFrom((wn7) scbVar);
        }

        @Override // p001o.fu6.InterfaceC13557b
        public int getNumber() {
            return this.f52380b;
        }

        @Override // p001o.fu6.InterfaceC13557b
        public boolean isPacked() {
            return this.f52383e;
        }

        @Override // p001o.fu6.InterfaceC13557b
        /* renamed from: k */
        public boolean mo27516k() {
            return this.f52382d;
        }

        @Override // p001o.fu6.InterfaceC13557b
        /* renamed from: l */
        public fbj.EnumC13396b mo27517l() {
            return this.f52381c;
        }

        @Override // p001o.fu6.InterfaceC13557b
        /* renamed from: q */
        public fbj.EnumC13397c mo27518q() {
            return this.f52381c.getJavaType();
        }
    }

    /* renamed from: o.wn7$f */
    public static class C17939f extends lp6 {

        /* renamed from: a */
        public final scb f52384a;

        /* renamed from: b */
        public final Object f52385b;

        /* renamed from: c */
        public final scb f52386c;

        /* renamed from: d */
        public final C17938e f52387d;

        public C17939f(scb scbVar, Object obj, scb scbVar2, C17938e c17938e, Class cls) {
            if (scbVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (c17938e.mo27517l() == fbj.EnumC13396b.MESSAGE && scbVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f52384a = scbVar;
            this.f52385b = obj;
            this.f52386c = scbVar2;
            this.f52387d = c17938e;
        }

        /* renamed from: b */
        public scb m54740b() {
            return this.f52384a;
        }

        /* renamed from: c */
        public fbj.EnumC13396b m54741c() {
            return this.f52387d.mo27517l();
        }

        /* renamed from: d */
        public scb m54742d() {
            return this.f52386c;
        }

        /* renamed from: e */
        public int m54743e() {
            return this.f52387d.getNumber();
        }

        /* renamed from: f */
        public boolean m54744f() {
            return this.f52387d.f52382d;
        }
    }

    /* renamed from: o.wn7$g */
    public enum EnumC17940g {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: b */
    public static C17939f m54730b(lp6 lp6Var) {
        if (lp6Var.m37580a()) {
            return (C17939f) lp6Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    /* renamed from: c */
    public static wn7 m54731c(wn7 wn7Var) throws ct8 {
        if (wn7Var == null || wn7Var.isInitialized()) {
            return wn7Var;
        }
        throw wn7Var.newUninitializedMessageException().m50928a().m21776k(wn7Var);
    }

    /* renamed from: e */
    public static wn7 m54732e(wn7 wn7Var, InputStream inputStream, qp6 qp6Var) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            jf3 jf3VarM33683f = jf3.m33683f(new r8.AbstractC16551a.a(inputStream, jf3.m33690x(i, inputStream)));
            wn7 partialFrom = parsePartialFrom(wn7Var, jf3VarM33683f, qp6Var);
            try {
                jf3VarM33683f.mo33699a(0);
                return partialFrom;
            } catch (ct8 e) {
                throw e.m21776k(partialFrom);
            }
        } catch (ct8 e2) {
            if (e2.m21774a()) {
                throw new ct8(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new ct8(e3);
        }
    }

    public static yn8.InterfaceC18437a emptyBooleanList() {
        return dk1.m23343l();
    }

    public static yn8.InterfaceC18438b emptyDoubleList() {
        return ax5.m17922j();
    }

    public static yn8.InterfaceC18442f emptyFloatList() {
        return b37.m18127l();
    }

    public static yn8.InterfaceC18443g emptyIntList() {
        return zk8.m59527j();
    }

    public static yn8.InterfaceC18445i emptyLongList() {
        return dla.m23413j();
    }

    public static <E> yn8.InterfaceC18446j emptyProtobufList() {
        return x1e.m55576e();
    }

    /* renamed from: f */
    public static wn7 m54733f(wn7 wn7Var, xq1 xq1Var, qp6 qp6Var) throws ct8 {
        jf3 jf3VarMo53604B = xq1Var.mo53604B();
        wn7 partialFrom = parsePartialFrom(wn7Var, jf3VarMo53604B, qp6Var);
        try {
            jf3VarMo53604B.mo33699a(0);
            return partialFrom;
        } catch (ct8 e) {
            throw e.m21776k(partialFrom);
        }
    }

    public static <T extends wn7> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        wn7 wn7Var = defaultInstanceMap.get(cls);
        if (wn7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wn7Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (wn7Var == null) {
            wn7Var = (T) ((wn7) z4i.m58724l(cls)).getDefaultInstanceForType();
            if (wn7Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, wn7Var);
        }
        return (T) wn7Var;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static yn8.InterfaceC18443g mutableCopy(yn8.InterfaceC18443g interfaceC18443g) {
        int size = interfaceC18443g.size();
        return interfaceC18443g.mo17923a(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(scb scbVar, String str, Object[] objArr) {
        return new gce(scbVar, str, objArr);
    }

    public static <ContainingType extends scb, Type> C17939f newRepeatedGeneratedExtension(ContainingType containingtype, scb scbVar, yn8.InterfaceC18440d interfaceC18440d, int i, fbj.EnumC13396b enumC13396b, boolean z, Class cls) {
        return new C17939f(containingtype, Collections.emptyList(), scbVar, new C17938e(interfaceC18440d, i, enumC13396b, true, z), cls);
    }

    public static <ContainingType extends scb, Type> C17939f newSingularGeneratedExtension(ContainingType containingtype, Type type2, scb scbVar, yn8.InterfaceC18440d interfaceC18440d, int i, fbj.EnumC13396b enumC13396b, Class cls) {
        return new C17939f(containingtype, type2, scbVar, new C17938e(interfaceC18440d, i, enumC13396b, false, false), cls);
    }

    public static <T extends wn7> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) m54731c(m54732e(t, inputStream, qp6.m45750c()));
    }

    public static <T extends wn7> T parseFrom(T t, ByteBuffer byteBuffer, qp6 qp6Var) {
        return (T) m54731c(parseFrom(t, jf3.m33685h(byteBuffer), qp6Var));
    }

    public static <T extends wn7> T parsePartialFrom(T t, jf3 jf3Var, qp6 qp6Var) throws ct8 {
        T t2 = (T) t.dynamicMethod(EnumC17940g.NEW_MUTABLE_INSTANCE);
        try {
            n5f n5fVarM52235e = v1e.m52231a().m52235e(t2);
            n5fVarM52235e.mo40129h(t2, kf3.m35569P(jf3Var), qp6Var);
            n5fVarM52235e.mo40123b(t2);
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof ct8) {
                throw ((ct8) e.getCause());
            }
            throw e;
        } catch (ct8 e2) {
            e = e2;
            if (e.m21774a()) {
                e = new ct8(e);
            }
            throw e.m21776k(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof ct8) {
                throw ((ct8) e3.getCause());
            }
            throw new ct8(e3).m21776k(t2);
        }
    }

    public static <T extends wn7> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    Object buildMessageInfo() {
        return dynamicMethod(EnumC17940g.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends wn7, BuilderType extends AbstractC17934a> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(EnumC17940g.NEW_BUILDER);
    }

    /* renamed from: d */
    public final void m54734d() {
        if (this.unknownFields == l4i.m36562c()) {
            this.unknownFields = l4i.m36566n();
        }
    }

    public Object dynamicMethod(EnumC17940g enumC17940g, Object obj) {
        return dynamicMethod(enumC17940g, obj, null);
    }

    public abstract Object dynamicMethod(EnumC17940g enumC17940g, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return v1e.m52231a().m52235e(this).mo40128g(this, (wn7) obj);
        }
        return false;
    }

    @Override // p001o.r8
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final hxc getParserForType() {
        return (hxc) dynamicMethod(EnumC17940g.GET_PARSER);
    }

    @Override // p001o.scb
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = v1e.m52231a().m52235e(this).mo40125d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iMo40127f = v1e.m52231a().m52235e(this).mo40127f(this);
        this.memoizedHashCode = iMo40127f;
        return iMo40127f;
    }

    @Override // p001o.tcb
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        v1e.m52231a().m52235e(this).mo40123b(this);
    }

    public void mergeLengthDelimitedField(int i, xq1 xq1Var) {
        m54734d();
        this.unknownFields.m36577k(i, xq1Var);
    }

    public final void mergeUnknownFields(l4i l4iVar) {
        this.unknownFields = l4i.m36565m(this.unknownFields, l4iVar);
    }

    public void mergeVarintField(int i, int i2) {
        m54734d();
        this.unknownFields.m36578l(i, i2);
    }

    public boolean parseUnknownField(int i, jf3 jf3Var) {
        if (fbj.m26426b(i) == 4) {
            return false;
        }
        m54734d();
        return this.unknownFields.m36575i(i, jf3Var);
    }

    @Override // p001o.r8
    void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        return vcb.m52520e(this, super.toString());
    }

    @Override // p001o.scb
    public void writeTo(nf3 nf3Var) {
        v1e.m52231a().m52235e(this).mo40131j(this, pf3.m43560P(nf3Var));
    }

    public static final <T extends wn7> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(EnumC17940g.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo40124c = v1e.m52231a().m52235e(t).mo40124c(t);
        if (z) {
            t.dynamicMethod(EnumC17940g.SET_MEMOIZED_IS_INITIALIZED, zMo40124c ? t : null);
        }
        return zMo40124c;
    }

    public final <MessageType extends wn7, BuilderType extends AbstractC17934a> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((wn7) messagetype);
    }

    public Object dynamicMethod(EnumC17940g enumC17940g) {
        return dynamicMethod(enumC17940g, null, null);
    }

    @Override // p001o.tcb
    public final wn7 getDefaultInstanceForType() {
        return (wn7) dynamicMethod(EnumC17940g.GET_DEFAULT_INSTANCE);
    }

    @Override // p001o.scb
    public final AbstractC17934a newBuilderForType() {
        return (AbstractC17934a) dynamicMethod(EnumC17940g.NEW_BUILDER);
    }

    @Override // p001o.scb
    public final AbstractC17934a toBuilder() {
        AbstractC17934a abstractC17934a = (AbstractC17934a) dynamicMethod(EnumC17940g.NEW_BUILDER);
        abstractC17934a.mergeFrom(this);
        return abstractC17934a;
    }

    public static yn8.InterfaceC18445i mutableCopy(yn8.InterfaceC18445i interfaceC18445i) {
        int size = interfaceC18445i.size();
        return interfaceC18445i.mo17923a(size == 0 ? 10 : size * 2);
    }

    public static <T extends wn7> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, qp6.m45750c());
    }

    public static <T extends wn7> T parseDelimitedFrom(T t, InputStream inputStream, qp6 qp6Var) {
        return (T) m54731c(m54732e(t, inputStream, qp6Var));
    }

    public static <T extends wn7> T parseFrom(T t, xq1 xq1Var) {
        return (T) m54731c(parseFrom(t, xq1Var, qp6.m45750c()));
    }

    public static yn8.InterfaceC18442f mutableCopy(yn8.InterfaceC18442f interfaceC18442f) {
        int size = interfaceC18442f.size();
        return interfaceC18442f.mo17923a(size == 0 ? 10 : size * 2);
    }

    public static <T extends wn7> T parseFrom(T t, xq1 xq1Var, qp6 qp6Var) {
        return (T) m54731c(m54733f(t, xq1Var, qp6Var));
    }

    public static yn8.InterfaceC18438b mutableCopy(yn8.InterfaceC18438b interfaceC18438b) {
        int size = interfaceC18438b.size();
        return interfaceC18438b.mo17923a(size == 0 ? 10 : size * 2);
    }

    public static <T extends wn7> T parseFrom(T t, byte[] bArr) {
        return (T) m54731c(parsePartialFrom(t, bArr, 0, bArr.length, qp6.m45750c()));
    }

    public static yn8.InterfaceC18437a mutableCopy(yn8.InterfaceC18437a interfaceC18437a) {
        int size = interfaceC18437a.size();
        return interfaceC18437a.mo17923a(size == 0 ? 10 : size * 2);
    }

    public static <T extends wn7> T parseFrom(T t, byte[] bArr, qp6 qp6Var) {
        return (T) m54731c(parsePartialFrom(t, bArr, 0, bArr.length, qp6Var));
    }

    public static <E> yn8.InterfaceC18446j mutableCopy(yn8.InterfaceC18446j interfaceC18446j) {
        int size = interfaceC18446j.size();
        return interfaceC18446j.mo17923a(size == 0 ? 10 : size * 2);
    }

    public static <T extends wn7> T parseFrom(T t, InputStream inputStream) {
        return (T) m54731c(parsePartialFrom(t, jf3.m33683f(inputStream), qp6.m45750c()));
    }

    public static <T extends wn7> T parsePartialFrom(T t, byte[] bArr, int i, int i2, qp6 qp6Var) throws ct8 {
        T t2 = (T) t.dynamicMethod(EnumC17940g.NEW_MUTABLE_INSTANCE);
        try {
            n5f n5fVarM52235e = v1e.m52231a().m52235e(t2);
            n5fVarM52235e.mo40130i(t2, bArr, i, i + i2, new no0.C15617b(qp6Var));
            n5fVarM52235e.mo40123b(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof ct8) {
                throw ((ct8) e.getCause());
            }
            throw new ct8(e).m21776k(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw ct8.m21773m().m21776k(t2);
        } catch (ct8 e2) {
            e = e2;
            if (e.m21774a()) {
                e = new ct8(e);
            }
            throw e.m21776k(t2);
        }
    }

    public static <T extends wn7> T parseFrom(T t, InputStream inputStream, qp6 qp6Var) {
        return (T) m54731c(parsePartialFrom(t, jf3.m33683f(inputStream), qp6Var));
    }

    public static <T extends wn7> T parseFrom(T t, jf3 jf3Var) {
        return (T) parseFrom(t, jf3Var, qp6.m45750c());
    }

    public static <T extends wn7> T parseFrom(T t, jf3 jf3Var, qp6 qp6Var) {
        return (T) m54731c(parsePartialFrom(t, jf3Var, qp6Var));
    }

    public static <T extends wn7> T parsePartialFrom(T t, jf3 jf3Var) {
        return (T) parsePartialFrom(t, jf3Var, qp6.m45750c());
    }
}
