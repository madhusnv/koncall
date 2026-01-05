package p001o;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import p001o.pm6;

/* loaded from: classes2.dex */
public final class hk7 implements pm6 {

    /* renamed from: d */
    public static final pm6.InterfaceC16140c f27078d = new pm6.InterfaceC16140c() { // from class: o.bk7
        @Override // p001o.pm6.InterfaceC16140c
        /* renamed from: a */
        public final pm6 mo19289a(UUID uuid) {
            return hk7.m30682B(uuid);
        }
    };

    /* renamed from: a */
    public final UUID f27079a;

    /* renamed from: b */
    public final MediaDrm f27080b;

    /* renamed from: c */
    public int f27081c;

    /* renamed from: o.hk7$a */
    public static class C13987a {
        /* renamed from: a */
        public static boolean m30700a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        /* renamed from: b */
        public static void m30701b(MediaDrm mediaDrm, byte[] bArr, jbd jbdVar) {
            LogSessionId logSessionIdM33479a = jbdVar.m33479a();
            if (logSessionIdM33479a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ek7.m25187a(op0.m42515e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdM33479a);
        }
    }

    public hk7(UUID uuid) {
        op0.m42515e(uuid);
        op0.m42512b(!dr1.f20424b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27079a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m30691u(uuid));
        this.f27080b = mediaDrm;
        this.f27081c = 1;
        if (dr1.f20426d.equals(uuid) && m30683C()) {
            m30692w(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m30681A(pm6.InterfaceC16139b interfaceC16139b, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        interfaceC16139b.mo43871a(this, bArr, i, i2, bArr2);
    }

    /* renamed from: B */
    public static /* synthetic */ pm6 m30682B(UUID uuid) {
        try {
            return m30684D(uuid);
        } catch (i5i unused) {
            ria.m46819c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new h16();
        }
    }

    /* renamed from: C */
    public static boolean m30683C() {
        return "ASUS_Z00AD".equals(sqi.f45793d);
    }

    /* renamed from: D */
    public static hk7 m30684D(UUID uuid) throws i5i {
        try {
            return new hk7(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new i5i(1, e);
        } catch (Exception e2) {
            throw new i5i(2, e2);
        }
    }

    /* renamed from: p */
    public static byte[] m30687p(byte[] bArr) {
        zwc zwcVar = new zwc(bArr);
        int iM60040u = zwcVar.m60040u();
        short sM60042w = zwcVar.m60042w();
        short sM60042w2 = zwcVar.m60042w();
        if (sM60042w != 1 || sM60042w2 != 1) {
            ria.m46822f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sM60042w3 = zwcVar.m60042w();
        Charset charset = uh2.f48933e;
        String strM60002F = zwcVar.m60002F(sM60042w3, charset);
        if (strM60002F.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strM60002F.indexOf("</DATA>");
        if (iIndexOf == -1) {
            ria.m46824h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strM60002F.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM60002F.substring(iIndexOf);
        int i = iM60040u + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sM60042w);
        byteBufferAllocate.putShort(sM60042w2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    /* renamed from: r */
    public static byte[] m30688r(UUID uuid, byte[] bArr) {
        return dr1.f20425c.equals(uuid) ? la3.m36831a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m30689s(UUID uuid, byte[] bArr) {
        UUID uuid2 = dr1.f20427e;
        if (uuid2.equals(uuid)) {
            byte[] bArrM22311e = d3e.m22311e(bArr, uuid);
            if (bArrM22311e != null) {
                bArr = bArrM22311e;
            }
            bArr = d3e.m22307a(uuid2, m30687p(bArr));
        }
        if (sqi.f45790a >= 23 || !dr1.f20426d.equals(uuid)) {
            if (uuid2.equals(uuid) && "Amazon".equals(sqi.f45792c)) {
                String str = sqi.f45793d;
                if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                    byte[] bArrM22311e2 = d3e.m22311e(bArr, uuid);
                    if (bArrM22311e2 != null) {
                        return bArrM22311e2;
                    }
                }
            }
        }
        return bArr;
    }

    /* renamed from: t */
    public static String m30690t(UUID uuid, String str) {
        return (sqi.f45790a < 26 && dr1.f20425c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* renamed from: u */
    public static UUID m30691u(UUID uuid) {
        return (sqi.f45790a >= 27 || !dr1.f20425c.equals(uuid)) ? uuid : dr1.f20424b;
    }

    /* renamed from: w */
    public static void m30692w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: y */
    public static DrmInitData.SchemeData m30693y(UUID uuid, List list) {
        boolean z;
        if (!dr1.f20426d.equals(uuid)) {
            return (DrmInitData.SchemeData) list.get(0);
        }
        if (sqi.f45790a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i);
                byte[] bArr = (byte[]) op0.m42515e(schemeData2.f7895e);
                if (!sqi.m48724c(schemeData2.f7894d, schemeData.f7894d) || !sqi.m48724c(schemeData2.f7893c, schemeData.f7893c) || !d3e.m22309c(bArr)) {
                    z = false;
                    break;
                }
                length += bArr.length;
            }
            z = true;
            if (z) {
                byte[] bArr2 = new byte[length];
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    byte[] bArr3 = (byte[]) op0.m42515e(((DrmInitData.SchemeData) list.get(i3)).f7895e);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i2, length2);
                    i2 += length2;
                }
                return schemeData.m6686b(bArr2);
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i4);
            int iM22313g = d3e.m22313g((byte[]) op0.m42515e(schemeData3.f7895e));
            int i5 = sqi.f45790a;
            if (i5 < 23 && iM22313g == 0) {
                return schemeData3;
            }
            if (i5 >= 23 && iM22313g == 1) {
                return schemeData3;
            }
        }
        return (DrmInitData.SchemeData) list.get(0);
    }

    /* renamed from: E */
    public final boolean m30694E() {
        return sqi.f45790a < 21 && dr1.f20426d.equals(this.f27079a) && "L3".equals(m30698x("securityLevel"));
    }

    @Override // p001o.pm6
    /* renamed from: a */
    public void mo29733a(final pm6.InterfaceC16139b interfaceC16139b) {
        this.f27080b.setOnEventListener(interfaceC16139b == null ? null : new MediaDrm.OnEventListener() { // from class: o.ck7
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f18264a.m30681A(interfaceC16139b, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // p001o.pm6
    /* renamed from: b */
    public Map mo29734b(byte[] bArr) {
        return this.f27080b.queryKeyStatus(bArr);
    }

    @Override // p001o.pm6
    /* renamed from: c */
    public pm6.C16141d mo29735c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f27080b.getProvisionRequest();
        return new pm6.C16141d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p001o.pm6
    /* renamed from: d */
    public byte[] mo29736d() {
        return this.f27080b.openSession();
    }

    @Override // p001o.pm6
    /* renamed from: e */
    public void mo29737e(byte[] bArr, byte[] bArr2) {
        this.f27080b.restoreKeys(bArr, bArr2);
    }

    @Override // p001o.pm6
    /* renamed from: f */
    public void mo29738f(byte[] bArr) throws DeniedByServerException {
        this.f27080b.provideProvisionResponse(bArr);
    }

    @Override // p001o.pm6
    /* renamed from: g */
    public int mo29739g() {
        return 2;
    }

    @Override // p001o.pm6
    /* renamed from: i */
    public void mo30695i(byte[] bArr, jbd jbdVar) {
        if (sqi.f45790a >= 31) {
            try {
                C13987a.m30701b(this.f27080b, bArr, jbdVar);
            } catch (UnsupportedOperationException unused) {
                ria.m46824h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p001o.pm6
    /* renamed from: j */
    public boolean mo29741j(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        MediaCrypto mediaCrypto;
        if (sqi.f45790a < 31 || !m30699z()) {
            MediaCrypto mediaCrypto2 = null;
            try {
                mediaCrypto = new MediaCrypto(this.f27079a, bArr);
            } catch (MediaCryptoException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                mediaCrypto.release();
            } catch (MediaCryptoException unused2) {
                mediaCrypto2 = mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                zRequiresSecureDecoderComponent = true;
                if (zRequiresSecureDecoderComponent) {
                }
            } catch (Throwable th2) {
                th = th2;
                mediaCrypto2 = mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            }
        } else {
            zRequiresSecureDecoderComponent = C13987a.m30700a(this.f27080b, str);
        }
        return (zRequiresSecureDecoderComponent || m30694E()) ? false : true;
    }

    @Override // p001o.pm6
    /* renamed from: k */
    public void mo29742k(byte[] bArr) {
        this.f27080b.closeSession(bArr);
    }

    @Override // p001o.pm6
    /* renamed from: l */
    public byte[] mo29743l(byte[] bArr, byte[] bArr2) throws JSONException {
        if (dr1.f20425c.equals(this.f27079a)) {
            bArr2 = la3.m36832b(bArr2);
        }
        return this.f27080b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p001o.pm6
    /* renamed from: m */
    public pm6.C16138a mo29744m(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataM30693y;
        byte[] bArrM30689s;
        String strM30690t;
        if (list != null) {
            schemeDataM30693y = m30693y(this.f27079a, list);
            bArrM30689s = m30689s(this.f27079a, (byte[]) op0.m42515e(schemeDataM30693y.f7895e));
            strM30690t = m30690t(this.f27079a, schemeDataM30693y.f7894d);
        } else {
            schemeDataM30693y = null;
            bArrM30689s = null;
            strM30690t = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f27080b.getKeyRequest(bArr, bArrM30689s, strM30690t, i, map);
        byte[] bArrM30688r = m30688r(this.f27079a, keyRequest.getData());
        String strM30696q = m30696q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strM30696q) && schemeDataM30693y != null && !TextUtils.isEmpty(schemeDataM30693y.f7893c)) {
            strM30696q = schemeDataM30693y.f7893c;
        }
        return new pm6.C16138a(bArrM30688r, strM30696q, sqi.f45790a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    /* renamed from: q */
    public final String m30696q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (sqi.f45790a >= 33 && "https://default.url".equals(str)) {
            String strM30698x = m30698x(ClientCookie.VERSION_ATTR);
            if (Objects.equals(strM30698x, "1.2") || Objects.equals(strM30698x, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    @Override // p001o.pm6
    public synchronized void release() {
        int i = this.f27081c - 1;
        this.f27081c = i;
        if (i == 0) {
            this.f27080b.release();
        }
    }

    @Override // p001o.pm6
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public zj7 mo29740h(byte[] bArr) {
        return new zj7(m30691u(this.f27079a), bArr, m30694E());
    }

    /* renamed from: x */
    public String m30698x(String str) {
        return this.f27080b.getPropertyString(str);
    }

    /* renamed from: z */
    public final boolean m30699z() {
        if (!this.f27079a.equals(dr1.f20426d)) {
            return this.f27079a.equals(dr1.f20425c);
        }
        String strM30698x = m30698x(ClientCookie.VERSION_ATTR);
        return (strM30698x.startsWith("v5.") || strM30698x.startsWith("14.") || strM30698x.startsWith("15.") || strM30698x.startsWith("16.0")) ? false : true;
    }
}
