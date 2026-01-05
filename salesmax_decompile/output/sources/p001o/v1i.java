package p001o;

import android.net.Uri;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class v1i extends wb1 {

    /* renamed from: e */
    public final int f49776e;

    /* renamed from: f */
    public final byte[] f49777f;

    /* renamed from: g */
    public final DatagramPacket f49778g;

    /* renamed from: h */
    public Uri f49779h;

    /* renamed from: i */
    public DatagramSocket f49780i;

    /* renamed from: j */
    public MulticastSocket f49781j;

    /* renamed from: k */
    public InetAddress f49782k;

    /* renamed from: l */
    public boolean f49783l;

    /* renamed from: m */
    public int f49784m;

    /* renamed from: o.v1i$a */
    public static final class C17500a extends fz4 {
        public C17500a(Throwable th, int i) {
            super(th, i);
        }
    }

    public v1i() {
        this(2000);
    }

    @Override // p001o.dz4
    public void close() throws IOException {
        this.f49779h = null;
        MulticastSocket multicastSocket = this.f49781j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) op0.m42515e(this.f49782k));
            } catch (IOException unused) {
            }
            this.f49781j = null;
        }
        DatagramSocket datagramSocket = this.f49780i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f49780i = null;
        }
        this.f49782k = null;
        this.f49784m = 0;
        if (this.f49783l) {
            this.f49783l = false;
            m54153o();
        }
    }

    @Override // p001o.dz4
    /* renamed from: e */
    public long mo23960e(iz4 iz4Var) throws IOException {
        Uri uri = iz4Var.f29380a;
        this.f49779h = uri;
        String str = (String) op0.m42515e(uri.getHost());
        int port = this.f49779h.getPort();
        m54154p(iz4Var);
        try {
            this.f49782k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f49782k, port);
            if (this.f49782k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f49781j = multicastSocket;
                multicastSocket.joinGroup(this.f49782k);
                this.f49780i = this.f49781j;
            } else {
                this.f49780i = new DatagramSocket(inetSocketAddress);
            }
            this.f49780i.setSoTimeout(this.f49776e);
            this.f49783l = true;
            m54155q(iz4Var);
            return -1L;
        } catch (IOException e) {
            throw new C17500a(e, CastStatusCodes.INVALID_REQUEST);
        } catch (SecurityException e2) {
            throw new C17500a(e2, CastStatusCodes.MESSAGE_TOO_LARGE);
        }
    }

    @Override // p001o.dz4
    public Uri getUri() {
        return this.f49779h;
    }

    @Override // p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f49784m == 0) {
            try {
                ((DatagramSocket) op0.m42515e(this.f49780i)).receive(this.f49778g);
                int length = this.f49778g.getLength();
                this.f49784m = length;
                m54152n(length);
            } catch (SocketTimeoutException e) {
                throw new C17500a(e, CastStatusCodes.CANCELED);
            } catch (IOException e2) {
                throw new C17500a(e2, CastStatusCodes.INVALID_REQUEST);
            }
        }
        int length2 = this.f49778g.getLength();
        int i3 = this.f49784m;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f49777f, length2 - i3, bArr, i, iMin);
        this.f49784m -= iMin;
        return iMin;
    }

    public v1i(int i) {
        this(i, 8000);
    }

    public v1i(int i, int i2) {
        super(true);
        this.f49776e = i2;
        byte[] bArr = new byte[i];
        this.f49777f = bArr;
        this.f49778g = new DatagramPacket(bArr, 0, i);
    }
}
