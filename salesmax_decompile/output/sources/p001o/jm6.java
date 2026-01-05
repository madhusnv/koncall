package p001o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class jm6 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo12685a(ByteBuffer byteBuffer, wo0 wo0Var) {
        return mo12687c(fq1.m27333g(byteBuffer), wo0Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo12686b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo12687c(InputStream inputStream, wo0 wo0Var) {
        int iM32354i = new im6(inputStream).m32354i("Orientation", 1);
        if (iM32354i == 0) {
            return -1;
        }
        return iM32354i;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo12688d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
