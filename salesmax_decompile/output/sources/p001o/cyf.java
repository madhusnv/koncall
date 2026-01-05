package p001o;

import android.os.SystemClock;
import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import org.objectweb.asm.Opcodes;
import p001o.xga;

/* loaded from: classes2.dex */
public abstract class cyf {

    /* renamed from: a */
    public static final Object f18845a = new Object();

    /* renamed from: b */
    public static final Object f18846b = new Object();

    /* renamed from: c */
    public static boolean f18847c = false;

    /* renamed from: d */
    public static long f18848d = 0;

    /* renamed from: e */
    public static String f18849e = "time.android.com";

    /* renamed from: o.cyf$b */
    public interface InterfaceC12768b {
        /* renamed from: a */
        void mo6946a();

        /* renamed from: b */
        void mo6947b(IOException iOException);
    }

    /* renamed from: o.cyf$c */
    public static final class C12769c implements xga.InterfaceC18150b {

        /* renamed from: a */
        public final InterfaceC12768b f18850a;

        public C12769c(InterfaceC12768b interfaceC12768b) {
            this.f18850a = interfaceC12768b;
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: k */
        public void mo6963k(xga.InterfaceC18153e interfaceC18153e, long j, long j2) {
            if (this.f18850a != null) {
                if (cyf.m22068k()) {
                    this.f18850a.mo6946a();
                } else {
                    this.f18850a.mo6947b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: m */
        public void mo6964m(xga.InterfaceC18153e interfaceC18153e, long j, long j2, boolean z) {
        }

        @Override // p001o.xga.InterfaceC18150b
        /* renamed from: o */
        public xga.C18151c mo6965o(xga.InterfaceC18153e interfaceC18153e, long j, long j2, IOException iOException, int i) {
            InterfaceC12768b interfaceC12768b = this.f18850a;
            if (interfaceC12768b != null) {
                interfaceC12768b.mo6947b(iOException);
            }
            return xga.f53733f;
        }
    }

    /* renamed from: o.cyf$d */
    public static final class C12770d implements xga.InterfaceC18153e {
        public C12770d() {
        }

        @Override // p001o.xga.InterfaceC18153e
        /* renamed from: b */
        public void mo22073b() {
        }

        @Override // p001o.xga.InterfaceC18153e
        public void load() {
            synchronized (cyf.f18845a) {
                synchronized (cyf.f18846b) {
                    if (cyf.f18847c) {
                        return;
                    }
                    long jM22069l = cyf.m22069l();
                    synchronized (cyf.f18846b) {
                        long unused = cyf.f18848d = jM22069l;
                        boolean unused2 = cyf.f18847c = true;
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m22064g(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b2));
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        }
    }

    /* renamed from: h */
    public static long m22065h() {
        long j;
        synchronized (f18846b) {
            j = f18847c ? f18848d : -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: i */
    public static String m22066i() {
        String str;
        synchronized (f18846b) {
            str = f18849e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m22067j(xga xgaVar, InterfaceC12768b interfaceC12768b) {
        if (m22068k()) {
            if (interfaceC12768b != null) {
                interfaceC12768b.mo6946a();
            }
        } else {
            if (xgaVar == null) {
                xgaVar = new xga("SntpClient");
            }
            xgaVar.m56270n(new C12770d(), new C12769c(interfaceC12768b), 1);
        }
    }

    /* renamed from: k */
    public static boolean m22068k() {
        boolean z;
        synchronized (f18846b) {
            z = f18847c;
        }
        return z;
    }

    /* renamed from: l */
    public static long m22069l() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(m22066i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(TransferRecord.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, Opcodes.LSHR);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m22072o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long jM22071n = m22071n(bArr, 24);
            long jM22071n2 = m22071n(bArr, 32);
            long jM22071n3 = m22071n(bArr, 40);
            m22064g((byte) ((b >> 6) & 3), (byte) (b & 7), i, jM22071n3);
            long j2 = (j + (((jM22071n2 - jM22071n) + (jM22071n3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m22070m(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & Opcodes.LAND) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & Opcodes.LAND) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & Opcodes.LAND) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & Opcodes.LAND) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    /* renamed from: n */
    public static long m22071n(byte[] bArr, int i) {
        long jM22070m = m22070m(bArr, i);
        long jM22070m2 = m22070m(bArr, i + 4);
        if (jM22070m == 0 && jM22070m2 == 0) {
            return 0L;
        }
        return ((jM22070m - 2208988800L) * 1000) + ((jM22070m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    public static void m22072o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) (j4 >> 24);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j4 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j4 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j4 >> 0);
        long j5 = (j3 * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j5 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j5 >> 16);
        bArr[i7] = (byte) (j5 >> 8);
        bArr[i7 + 1] = (byte) (Math.random() * 255.0d);
    }
}
