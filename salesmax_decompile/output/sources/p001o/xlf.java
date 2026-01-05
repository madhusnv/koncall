package p001o;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import java.io.File;

/* loaded from: classes5.dex */
public final class xlf {

    /* renamed from: a */
    public static final xlf f53903a = new xlf();

    /* renamed from: a */
    public static final GraphRequest m56465a(AccessToken accessToken, Uri uri, GraphRequest.InterfaceC10763b interfaceC10763b) {
        sq8.m48649h(uri, "imageUri");
        String path = uri.getPath();
        if (cri.b0(uri) && path != null) {
            return m56466b(accessToken, new File(path), interfaceC10763b);
        }
        if (!cri.m21656Y(uri)) {
            throw new ur6("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(TransferTable.COLUMN_FILE, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, p38.POST, interfaceC10763b, null, 32, null);
    }

    /* renamed from: b */
    public static final GraphRequest m56466b(AccessToken accessToken, File file, GraphRequest.InterfaceC10763b interfaceC10763b) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(TransferTable.COLUMN_FILE, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, p38.POST, interfaceC10763b, null, 32, null);
    }
}
