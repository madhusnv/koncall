package p001o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class il6 {

    /* renamed from: o.il6$a */
    public /* synthetic */ class C14310a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28796a;

        static {
            int[] iArr = new int[ofc.values().length];
            try {
                iArr[ofc.Windows.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f28796a = iArr;
        }
    }

    /* renamed from: o.il6$b */
    public static final class C14311b extends jgg implements nl7 {

        /* renamed from: a */
        public Object f28797a;

        /* renamed from: b */
        public Object f28798b;

        /* renamed from: c */
        public Object f28799c;

        /* renamed from: d */
        public int f28800d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f28801e;

        /* renamed from: f */
        public final /* synthetic */ long f28802f;

        /* renamed from: g */
        public final /* synthetic */ long f28803g;

        /* renamed from: o.il6$b$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f28804a;

            /* renamed from: b */
            public final /* synthetic */ BufferedReader f28805b;

            /* renamed from: c */
            public final /* synthetic */ char[] f28806c;

            /* renamed from: d */
            public final /* synthetic */ StringBuilder f28807d;

            /* renamed from: e */
            public final /* synthetic */ long f28808e;

            /* renamed from: f */
            public final /* synthetic */ Process f28809f;

            /* renamed from: o.il6$b$a$a, reason: collision with other inner class name */
            public static final class C19589a extends jgg implements nl7 {

                /* renamed from: a */
                public int f28810a;

                /* renamed from: b */
                public final /* synthetic */ Process f28811b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19589a(Process process, n64 n64Var) {
                    super(2, n64Var);
                    this.f28811b = process;
                }

                @Override // p001o.vb1
                public final n64 create(Object obj, n64 n64Var) {
                    return new C19589a(this.f28811b, n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    uq8.m51918f();
                    if (this.f28810a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return ml1.m39304d(this.f28811b.waitFor());
                }

                @Override // p001o.nl7
                public final Object invoke(h84 h84Var, n64 n64Var) {
                    return ((C19589a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, long j, Process process, n64 n64Var) {
                super(2, n64Var);
                this.f28805b = bufferedReader;
                this.f28806c = cArr;
                this.f28807d = sb;
                this.f28808e = j;
                this.f28809f = process;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f28805b, this.f28806c, this.f28807d, this.f28808e, this.f28809f, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f28804a;
                if (i == 0) {
                    wre.m54934b(obj);
                    while (this.f28805b.read(this.f28806c) != -1) {
                        this.f28807d.append(this.f28806c);
                        if (this.f28807d.length() > this.f28808e) {
                            throw new sc4("Process output exceeded limit of " + this.f28808e + " bytes", null, 2, null);
                        }
                    }
                    z74 z74VarM25611b = eu5.m25611b();
                    C19589a c19589a = new C19589a(this.f28809f, null);
                    this.f28804a = 1;
                    obj = pm1.m43867g(z74VarM25611b, c19589a, this);
                    if (obj == objM51918f) {
                        return objM51918f;
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
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14311b(ArrayList arrayList, long j, long j2, n64 n64Var) {
            super(2, n64Var);
            this.f28801e = arrayList;
            this.f28802f = j;
            this.f28803g = j2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14311b(this.f28801e, this.f28802f, this.f28803g, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Process process;
            BufferedReader bufferedReader;
            StringBuilder sb;
            String strM51644d;
            Object objM51918f = uq8.m51918f();
            int i = this.f28800d;
            if (i == 0) {
                wre.m54934b(obj);
                Process processStart = new ProcessBuilder(new String[0]).command(this.f28801e).start();
                InputStream inputStream = processStart.getInputStream();
                sq8.m48648g(inputStream, "getInputStream(...)");
                Reader inputStreamReader = new InputStreamReader(inputStream, sh2.f45422b);
                BufferedReader bufferedReader2 = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                StringBuilder sb2 = new StringBuilder();
                long j = this.f28802f;
                a aVar = new a(bufferedReader2, new char[1024], sb2, this.f28803g, processStart, null);
                this.f28797a = processStart;
                this.f28798b = bufferedReader2;
                this.f28799c = sb2;
                this.f28800d = 1;
                if (rmh.m46984c(j, aVar, this) == objM51918f) {
                    return objM51918f;
                }
                process = processStart;
                bufferedReader = bufferedReader2;
                sb = sb2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sb = (StringBuilder) this.f28799c;
                bufferedReader = (BufferedReader) this.f28798b;
                process = (Process) this.f28797a;
                wre.m54934b(obj);
            }
            bufferedReader.close();
            if (process.exitValue() == 0) {
                strM51644d = sb.toString();
            } else {
                InputStream errorStream = process.getErrorStream();
                sq8.m48648g(errorStream, "getErrorStream(...)");
                Reader inputStreamReader2 = new InputStreamReader(errorStream, sh2.f45422b);
                BufferedReader bufferedReader3 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                try {
                    strM51644d = uih.m51644d(bufferedReader3);
                    tb3.m49666a(bufferedReader3, null);
                } finally {
                }
            }
            sq8.m48646e(strM51644d);
            return vyh.m53620a(ml1.m39304d(process.exitValue()), strM51644d);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14311b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final Object m32258a(String str, r9d r9dVar, long j, long j2, hb3 hb3Var, n64 n64Var) {
        ArrayList arrayList = new ArrayList();
        if (C14310a.f28796a[r9dVar.mo26793a().m42086a().ordinal()] == 1) {
            arrayList.add("cmd.exe");
            arrayList.add("/C");
        } else {
            arrayList.add("sh");
            arrayList.add("-c");
        }
        arrayList.add(str);
        return pm1.m43867g(eu5.m25611b(), new C14311b(arrayList, j2, j, null), n64Var);
    }
}
