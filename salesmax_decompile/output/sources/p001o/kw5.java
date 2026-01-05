package p001o;

import android.content.Context;
import android.net.Uri;
import com.amplifyframework.rx.RxAmplify;
import com.amplifyframework.storage.StoragePath;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;
import com.amplifyframework.storage.options.StorageUploadFileOptions;
import com.amplifyframework.storage.options.StorageUploadInputStreamOptions;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/* loaded from: classes.dex */
public interface kw5 extends me1 {
    default x6c Hn(Context context, Uri uri, String str, String str2, String str3, String str4, String str5) {
        return Ih(context.getContentResolver().openInputStream(uri), str, str2, str3, str4, str5);
    }

    default x6c Ih(InputStream inputStream, String str, String str2, String str3, String str4, String str5) {
        String str6 = String.format("%s/%s/%s", str, str2, str3);
        return RxAmplify.Storage.uploadInputStream(StoragePath.fromString(str4.toLowerCase(Locale.ROOT) + "/" + str6), inputStream, J2(str4, str5)).observeResult().m55019p(new rl7() { // from class: o.iw5
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((StorageUploadInputStreamResult) obj).getPath();
            }
        }).m55027y();
    }

    default StorageUploadInputStreamOptions J2(String str, String str2) {
        return ((StorageUploadInputStreamOptions.Builder) StorageUploadInputStreamOptions.builder().contentType(str2)).build();
    }

    default x6c S0(String str) {
        if (!str.startsWith("public/")) {
            str = "public".toLowerCase(Locale.ROOT) + "/" + str;
        }
        return RxAmplify.Storage.getUrl(StoragePath.fromString(str)).m55019p(new rl7() { // from class: o.jw5
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((StorageGetUrlResult) obj).getUrl();
            }
        }).m55027y();
    }

    default String Zn(String str) {
        return String.format("%s/%s/%s", on(), Eo(), str);
    }

    default x6c cw(File file, String str, String str2, String str3, String str4, String str5) {
        String str6 = String.format("%s/%s/%s", str, str2, str3);
        return RxAmplify.Storage.uploadFile(StoragePath.fromString(str4.toLowerCase(Locale.ROOT) + "/" + str6), file, jy(str4, str5)).observeResult().m55019p(new rl7() { // from class: o.gw5
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((StorageUploadFileResult) obj).getPath();
            }
        }).m55027y();
    }

    default StorageDownloadFileOptions he(String str) {
        return StorageDownloadFileOptions.builder().build();
    }

    default StorageUploadFileOptions jy(String str, String str2) {
        return ((StorageUploadFileOptions.Builder) StorageUploadFileOptions.builder().contentType(str2)).build();
    }

    default x6c nh(String str, File file, String str2) {
        if (!str.startsWith("public/")) {
            str = "public".toLowerCase(Locale.ROOT) + "/" + str;
        }
        return RxAmplify.Storage.downloadFile(StoragePath.fromString(str), file, he(str2)).observeResult().m55019p(new rl7() { // from class: o.hw5
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((StorageDownloadFileResult) obj).getFile();
            }
        }).m55027y();
    }
}
