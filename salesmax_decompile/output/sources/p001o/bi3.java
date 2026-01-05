package p001o;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class bi3 {
    /* renamed from: a */
    public static ResourcesLoader m19122a(Context context, Map map) {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrM23167i = di3.m23167i(context, map);
            StringBuilder sb = new StringBuilder();
            sb.append("Table created, length: ");
            sb.append(bArrM23167i.length);
            if (bArrM23167i.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                if (fileDescriptorMemfd_create == null) {
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                    }
                    return null;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(bArrM23167i);
                        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            xh3.m56310a();
                            ResourcesLoader resourcesLoaderM54396a = wh3.m54396a();
                            resourcesLoaderM54396a.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            Os.close(fileDescriptorMemfd_create);
                            return resourcesLoaderM54396a;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileDescriptorMemfd_create = null;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
