package zl;

import bz.C0802a;
import java.util.HashMap;
import og.ie;
import org.bouncycastle.asn1.BERTags;
import vl.C7717a;
import vl.C7721e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zl.a */
/* loaded from: classes.dex */
public final class C8990a extends ie {
    static {
        "openssh-key-v1\u0000".getBytes();
        HashMap map = new HashMap();
        map.put("3des-cbc", new C7717a(8, BERTags.PRIVATE, "3des-cbc", "DESede", "CBC"));
        map.put("aes128-cbc", new C7717a(16, 128, "aes128-cbc", "AES", "CBC"));
        map.put("aes192-cbc", new C7717a(16, BERTags.PRIVATE, "aes192-cbc", "AES", "CBC"));
        map.put("aes256-cbc", new C7717a(16, 256, "aes256-cbc", "AES", "CBC"));
        map.put("aes128-ctr", new C7717a(16, 128, "aes128-ctr", "AES", "CTR"));
        map.put("aes192-ctr", new C7717a(16, BERTags.PRIVATE, "aes192-ctr", "AES", "CTR"));
        map.put("aes256-ctr", new C7717a(16, 256, "aes256-ctr", "AES", "CTR"));
        map.put("aes256-gcm@openssh.com", new C7721e(256, "aes256-gcm@openssh.com"));
        map.put("aes128-gcm@openssh.com", new C7721e(128, "aes128-gcm@openssh.com"));
        map.put("chacha20-poly1305@openssh.com", new C0802a(13));
    }
}
