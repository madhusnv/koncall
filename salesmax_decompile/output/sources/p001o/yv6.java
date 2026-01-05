package p001o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes5.dex */
public class yv6 extends lha {
    public yv6(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p001o.lha
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo37219c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p001o.lha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo37220f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
