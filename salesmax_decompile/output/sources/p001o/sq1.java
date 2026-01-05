package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p001o.oq1;

/* loaded from: classes3.dex */
public abstract class sq1 {

    /* renamed from: o.sq1$a */
    public static final class C16890a extends o64 {

        /* renamed from: a */
        public Object f45752a;

        /* renamed from: b */
        public /* synthetic */ Object f45753b;

        /* renamed from: c */
        public int f45754c;

        public C16890a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45753b = obj;
            this.f45754c |= Integer.MIN_VALUE;
            return sq1.m48630e(null, null, this);
        }
    }

    /* renamed from: o.sq1$b */
    public static final class C16891b extends jgg implements nl7 {

        /* renamed from: a */
        public int f45755a;

        /* renamed from: b */
        public final /* synthetic */ oq1 f45756b;

        /* renamed from: c */
        public final /* synthetic */ File f45757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16891b(oq1 oq1Var, File file, n64 n64Var) {
            super(2, n64Var);
            this.f45756b = oq1Var;
            this.f45757c = file;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16891b(this.f45756b, this.f45757c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            h8f h8fVarMo39993c;
            Object objM51918f = uq8.m51918f();
            int i = this.f45755a;
            if (i == 0) {
                wre.m54934b(obj);
                oq1 oq1Var = this.f45756b;
                if (oq1Var instanceof oq1.AbstractC15864b) {
                    File file = this.f45757c;
                    y6f y6fVarMo39992c = ((oq1.AbstractC15864b) oq1Var).mo39992c();
                    this.f45755a = 1;
                    obj = sq1.m48630e(file, y6fVarMo39992c, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (oq1Var instanceof oq1.AbstractC15863a) {
                        h8fVarMo39993c = m7f.m38494c(((oq1.AbstractC15863a) oq1Var).mo39990c());
                    } else {
                        if (!(oq1Var instanceof oq1.AbstractC15866d)) {
                            throw new szb();
                        }
                        h8fVarMo39993c = ((oq1.AbstractC15866d) oq1Var).mo39993c();
                    }
                    f8f f8fVarM29833a = h69.m29833a(this.f45757c);
                    try {
                        u6f u6fVarM38492a = m7f.m38492a(f8fVarM29833a);
                        try {
                            long jB0 = u6fVarM38492a.B0(h8fVarMo39993c);
                            tb3.m49666a(u6fVarM38492a, null);
                            Long lM39305e = ml1.m39305e(jB0);
                            tb3.m49666a(f8fVarM29833a, null);
                            return lM39305e;
                        } finally {
                        }
                    } finally {
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16891b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: b */
    public static final oq1 m48627b(File file, long j, long j2) {
        sq8.m48649h(file, "<this>");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("start index " + j + " cannot be negative").toString());
        }
        long j3 = j - 1;
        if (!(j2 >= j3)) {
            throw new IllegalArgumentException(("end index " + j2 + " must be greater than or equal to start index minus one (" + j3 + ')').toString());
        }
        long length = file.length();
        if (j2 < length) {
            return new qu6(file, j, j2);
        }
        throw new IllegalArgumentException(("end index " + j2 + " must be less than file size " + length).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ oq1 m48628c(File file, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = file.length() - 1;
        }
        return m48627b(file, j, j2);
    }

    /* renamed from: d */
    public static final oq1 m48629d(oq1.C15865c c15865c, File file) {
        sq8.m48649h(c15865c, "<this>");
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        return m48628c(file, 0L, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m48630e(File file, y6f y6fVar, n64 n64Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C16890a c16890a;
        if (n64Var instanceof C16890a) {
            c16890a = (C16890a) n64Var;
            int i = c16890a.f45754c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16890a.f45754c = i - Integer.MIN_VALUE;
            } else {
                c16890a = new C16890a(n64Var);
            }
        }
        Object objM58851a = c16890a.f45753b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16890a.f45754c;
        try {
            if (i2 == 0) {
                wre.m54934b(objM58851a);
                f8f f8fVarM29833a = h69.m29833a(file);
                c16890a.f45752a = f8fVarM29833a;
                c16890a.f45754c = 1;
                objM58851a = z6f.m58851a(y6fVar, f8fVarM29833a, c16890a);
                file = f8fVarM29833a;
                if (objM58851a == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable = (Closeable) c16890a.f45752a;
                wre.m54934b(objM58851a);
                file = closeable;
            }
            Long lM39305e = ml1.m39305e(((Number) objM58851a).longValue());
            tb3.m49666a(file, null);
            return lM39305e;
        } finally {
        }
    }

    /* renamed from: f */
    public static final Object m48631f(oq1 oq1Var, File file, n64 n64Var) {
        return pm1.m43867g(eu5.m25611b(), new C16891b(oq1Var, file, null), n64Var);
    }
}
