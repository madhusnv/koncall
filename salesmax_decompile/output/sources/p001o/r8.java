package p001o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001o.scb;
import p001o.xq1;

/* loaded from: classes6.dex */
public abstract class r8 implements scb {
    protected int memoizedHashCode = 0;

    /* renamed from: o.r8$a */
    public static abstract class AbstractC16551a implements scb.InterfaceC16809a {
        /* renamed from: a */
        public static void m46329a(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        public static u3i newUninitializedMessageException(scb scbVar) {
            return new u3i(scbVar);
        }

        /* renamed from: b */
        public final String m46330b(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public abstract AbstractC16551a internalMergeFrom(r8 r8Var);

        public boolean mergeDelimitedFrom(InputStream inputStream, qp6 qp6Var) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            m69023mergeFrom((InputStream) new a(inputStream, jf3.m33690x(i, inputStream)), qp6Var);
            return true;
        }

        /* renamed from: mergeFrom */
        public abstract AbstractC16551a m69045mergeFrom(jf3 jf3Var, qp6 qp6Var);

        /* renamed from: mergeFrom */
        public abstract AbstractC16551a m69046mergeFrom(byte[] bArr, int i, int i2);

        /* renamed from: mergeFrom */
        public abstract AbstractC16551a m69047mergeFrom(byte[] bArr, int i, int i2, qp6 qp6Var);

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            yn8.m58012a(iterable);
            if (!(iterable instanceof yi9)) {
                if (iterable instanceof whd) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m46329a(iterable, list);
                    return;
                }
            }
            List listMo46221g = ((yi9) iterable).mo46221g();
            yi9 yi9Var = (yi9) list;
            int size = list.size();
            for (Object obj : listMo46221g) {
                if (obj == null) {
                    String str = "Element at index " + (yi9Var.size() - size) + " is null.";
                    for (int size2 = yi9Var.size() - 1; size2 >= size; size2--) {
                        yi9Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof xq1) {
                    yi9Var.z0((xq1) obj);
                } else {
                    yi9Var.add((String) obj);
                }
            }
        }

        /* renamed from: o.r8$a$a */
        public static final class a extends FilterInputStream {

            /* renamed from: a */
            public int f43122a;

            public a(InputStream inputStream, int i) {
                super(inputStream);
                this.f43122a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f43122a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f43122a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f43122a--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f43122a));
                if (jSkip >= 0) {
                    this.f43122a = (int) (this.f43122a - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f43122a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f43122a -= i4;
                }
                return i4;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, qp6.m45750c());
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69024mergeFrom(jf3 jf3Var) {
            return m69045mergeFrom(jf3Var, qp6.m45750c());
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69025mergeFrom(xq1 xq1Var) throws ct8 {
            try {
                jf3 jf3VarMo53604B = xq1Var.mo53604B();
                m69024mergeFrom(jf3VarMo53604B);
                jf3VarMo53604B.mo33699a(0);
                return this;
            } catch (ct8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m46330b("ByteString"), e2);
            }
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69026mergeFrom(xq1 xq1Var, qp6 qp6Var) throws ct8 {
            try {
                jf3 jf3VarMo53604B = xq1Var.mo53604B();
                m69045mergeFrom(jf3VarMo53604B, qp6Var);
                jf3VarMo53604B.mo33699a(0);
                return this;
            } catch (ct8 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m46330b("ByteString"), e2);
            }
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69027mergeFrom(byte[] bArr) {
            return m69046mergeFrom(bArr, 0, bArr.length);
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69028mergeFrom(byte[] bArr, qp6 qp6Var) {
            return m69047mergeFrom(bArr, 0, bArr.length, qp6Var);
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69022mergeFrom(InputStream inputStream) {
            jf3 jf3VarM33683f = jf3.m33683f(inputStream);
            m69024mergeFrom(jf3VarM33683f);
            jf3VarM33683f.mo33699a(0);
            return this;
        }

        /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public AbstractC16551a m69023mergeFrom(InputStream inputStream, qp6 qp6Var) {
            jf3 jf3VarM33683f = jf3.m33683f(inputStream);
            m69045mergeFrom(jf3VarM33683f, qp6Var);
            jf3VarM33683f.mo33699a(0);
            return this;
        }

        @Override // p001o.scb.InterfaceC16809a
        public AbstractC16551a mergeFrom(scb scbVar) {
            if (getDefaultInstanceForType().getClass().isInstance(scbVar)) {
                return internalMergeFrom((r8) scbVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: a */
    private String m46328a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC16551a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(xq1 xq1Var) {
        if (!xq1Var.mo53614y()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    abstract int getMemoizedSerializedSize();

    public int getSerializedSize(n5f n5fVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo40125d = n5fVar.mo40125d(this);
        setMemoizedSerializedSize(iMo40125d);
        return iMo40125d;
    }

    public u3i newUninitializedMessageException() {
        return new u3i(this);
    }

    abstract void setMemoizedSerializedSize(int i);

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            nf3 nf3VarE0 = nf3.e0(bArr);
            writeTo(nf3VarE0);
            nf3VarE0.m40487d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m46328a("byte array"), e);
        }
    }

    public xq1 toByteString() {
        try {
            xq1.C18217h c18217hM56577A = xq1.m56577A(getSerializedSize());
            writeTo(c18217hM56577A.m56602b());
            return c18217hM56577A.m56601a();
        } catch (IOException e) {
            throw new RuntimeException(m46328a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        nf3 nf3VarD0 = nf3.d0(outputStream, nf3.m40444G(nf3.m40446I(serializedSize) + serializedSize));
        nf3VarD0.K0(serializedSize);
        writeTo(nf3VarD0);
        nf3VarD0.a0();
    }

    public void writeTo(OutputStream outputStream) {
        nf3 nf3VarD0 = nf3.d0(outputStream, nf3.m40444G(getSerializedSize()));
        writeTo(nf3VarD0);
        nf3VarD0.a0();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC16551a.addAll((Iterable) iterable, (List) list);
    }
}
