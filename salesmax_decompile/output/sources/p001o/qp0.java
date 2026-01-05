package p001o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class qp0 extends lha {
    public qp0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return AssetFileDescriptor.class;
    }

    @Override // p001o.lha
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo37219c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // p001o.lha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo37220f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
