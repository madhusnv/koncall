package og;

import android.os.Build;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class cd {

    /* renamed from: a */
    public static final /* synthetic */ int f26363a = 0;

    /* renamed from: a */
    public static boolean m10577a() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    /* renamed from: b */
    public static void m10578b(String str) {
        if (m10577a()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e2) {
                throw new Error(AbstractC5601a.m11238i("FFmpegKit failed to start on ", "brand: " + Build.BRAND + ", model: " + Build.MODEL + ", device: " + Build.DEVICE + ", api level: " + Build.VERSION.SDK_INT + ", abis: " + FFmpegKitConfig.m3078a(Build.SUPPORTED_ABIS) + ", 32bit abis: " + FFmpegKitConfig.m3078a(Build.SUPPORTED_32_BIT_ABIS) + ", 64bit abis: " + FFmpegKitConfig.m3078a(Build.SUPPORTED_64_BIT_ABIS), "."), e2);
            }
        }
    }
}
