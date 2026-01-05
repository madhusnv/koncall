package p001o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class pdb {

    /* renamed from: o.pdb$a */
    public static class C16075a implements InterfaceC16077c {

        /* renamed from: a */
        public final ByteBuffer f39913a;

        public C16075a(ByteBuffer byteBuffer) {
            this.f39913a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p001o.pdb.InterfaceC16077c
        /* renamed from: a */
        public int mo43490a() {
            return this.f39913a.getInt();
        }

        @Override // p001o.pdb.InterfaceC16077c
        /* renamed from: b */
        public long mo43491b() {
            return pdb.m43488c(this.f39913a.getInt());
        }

        @Override // p001o.pdb.InterfaceC16077c
        /* renamed from: d */
        public void mo43492d(int i) {
            ByteBuffer byteBuffer = this.f39913a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // p001o.pdb.InterfaceC16077c
        public long getPosition() {
            return this.f39913a.position();
        }

        @Override // p001o.pdb.InterfaceC16077c
        public int readUnsignedShort() {
            return pdb.m43489d(this.f39913a.getShort());
        }
    }

    /* renamed from: o.pdb$b */
    public static class C16076b {

        /* renamed from: a */
        public final long f39914a;

        /* renamed from: b */
        public final long f39915b;

        public C16076b(long j, long j2) {
            this.f39914a = j;
            this.f39915b = j2;
        }

        /* renamed from: a */
        public long m43493a() {
            return this.f39914a;
        }
    }

    /* renamed from: o.pdb$c */
    public interface InterfaceC16077c {
        /* renamed from: a */
        int mo43490a();

        /* renamed from: b */
        long mo43491b();

        /* renamed from: d */
        void mo43492d(int i);

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    public static C16076b m43486a(InterfaceC16077c interfaceC16077c) throws IOException {
        long jMo43491b;
        interfaceC16077c.mo43492d(4);
        int unsignedShort = interfaceC16077c.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        interfaceC16077c.mo43492d(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jMo43491b = -1;
                break;
            }
            int iMo43490a = interfaceC16077c.mo43490a();
            interfaceC16077c.mo43492d(4);
            jMo43491b = interfaceC16077c.mo43491b();
            interfaceC16077c.mo43492d(4);
            if (1835365473 == iMo43490a) {
                break;
            }
            i++;
        }
        if (jMo43491b != -1) {
            interfaceC16077c.mo43492d((int) (jMo43491b - interfaceC16077c.getPosition()));
            interfaceC16077c.mo43492d(12);
            long jMo43491b2 = interfaceC16077c.mo43491b();
            for (int i2 = 0; i2 < jMo43491b2; i2++) {
                int iMo43490a2 = interfaceC16077c.mo43490a();
                long jMo43491b3 = interfaceC16077c.mo43491b();
                long jMo43491b4 = interfaceC16077c.mo43491b();
                if (1164798569 == iMo43490a2 || 1701669481 == iMo43490a2) {
                    return new C16076b(jMo43491b3 + jMo43491b, jMo43491b4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static odb m43487b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) m43486a(new C16075a(byteBufferDuplicate)).m43493a());
        return odb.m42079h(byteBufferDuplicate);
    }

    /* renamed from: c */
    public static long m43488c(int i) {
        return i & 4294967295L;
    }

    /* renamed from: d */
    public static int m43489d(short s) {
        return s & 65535;
    }
}
