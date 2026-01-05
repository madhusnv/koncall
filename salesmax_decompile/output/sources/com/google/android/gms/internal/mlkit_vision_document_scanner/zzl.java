package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import p001o.c64;

/* loaded from: classes3.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        strArr[1] = true != (str.equals("goldfish") || str.equals("ranchu")) ? "" : "androidx.test.services.storage.runfiles";
        zzc = strArr;
        String[] strArr2 = new String[3];
        int i = Build.VERSION.SDK_INT;
        strArr2[0] = i <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : "";
        strArr2[1] = i <= 25 ? "com.google.android.inputmethod.latin.dev.inputcontent" : "";
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        zzd = strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r13.zzd == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r13.zzd != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d6 A[Catch: IOException -> 0x0202, FileNotFoundException -> 0x0211, TryCatch #3 {FileNotFoundException -> 0x0211, IOException -> 0x0202, blocks: (B:67:0x0117, B:70:0x0136, B:72:0x013e, B:74:0x0146, B:76:0x014e, B:78:0x0156, B:80:0x015f, B:109:0x01d0, B:111:0x01d6, B:86:0x017b, B:88:0x0181, B:90:0x0187, B:93:0x0192, B:95:0x019f, B:97:0x01a3, B:100:0x01ae, B:101:0x01b1, B:103:0x01be, B:105:0x01c2, B:108:0x01cd, B:83:0x016c, B:113:0x01dc, B:114:0x01e5, B:115:0x01e6, B:116:0x01f3, B:117:0x01f4, B:118:0x0201), top: B:132:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b A[Catch: IOException -> 0x0202, FileNotFoundException -> 0x0211, TryCatch #3 {FileNotFoundException -> 0x0211, IOException -> 0x0202, blocks: (B:67:0x0117, B:70:0x0136, B:72:0x013e, B:74:0x0146, B:76:0x014e, B:78:0x0156, B:80:0x015f, B:109:0x01d0, B:111:0x01d6, B:86:0x017b, B:88:0x0181, B:90:0x0187, B:93:0x0192, B:95:0x019f, B:97:0x01a3, B:100:0x01ae, B:101:0x01b1, B:103:0x01be, B:105:0x01c2, B:108:0x01cd, B:83:0x016c, B:113:0x01dc, B:114:0x01e5, B:115:0x01e6, B:116:0x01f3, B:117:0x01f4, B:118:0x0201), top: B:132:0x0117 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InputStream zza(final Context context, Uri uri, zzk zzkVar) throws IOException {
        File dataDir;
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uri);
        }
        int i = 0;
        if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            String authority = uri.getAuthority();
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            if (providerInfoResolveContentProvider == null) {
                int iLastIndexOf = authority.lastIndexOf(64);
                if (iLastIndexOf >= 0) {
                    authority = authority.substring(iLastIndexOf + 1);
                    providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
                }
                if (providerInfoResolveContentProvider == null) {
                }
            }
            if (zzk.zzc(zzkVar, context, new zzp(uri, providerInfoResolveContentProvider, authority)) - 1 != 1) {
                if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
                    if (!zzkVar.zzd) {
                        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
                            String[] strArr = zzc;
                            int length = strArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= 2) {
                                    String[] strArr2 = zzd;
                                    int length2 = strArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 3) {
                                            String[] strArr3 = zzb;
                                            while (i < 6) {
                                                String str = strArr3[i];
                                                if (str.charAt(str.length() - 1) == '.') {
                                                    if (!providerInfoResolveContentProvider.packageName.startsWith(str)) {
                                                        i++;
                                                    }
                                                } else if (!providerInfoResolveContentProvider.packageName.equals(str)) {
                                                    i++;
                                                }
                                            }
                                        } else {
                                            if (strArr2[i3].equals(authority)) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    }
                                } else {
                                    if (strArr[i2].equals(authority)) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            return inputStreamOpenInputStream;
                        }
                        throw new FileNotFoundException("Content resolver returned null value.");
                    }
                }
            }
            throw new FileNotFoundException("Can't open content uri.");
        }
        if (!TransferTable.COLUMN_FILE.equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uri.getPath()).getCanonicalFile()), "r");
            try {
                String canonicalPath = new File(uri.getPath()).getCanonicalPath();
                zzo zzoVarZza = zzo.zza(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                zzo zzoVarZzb = zzo.zzb(canonicalPath);
                if (zzoVarZzb.zzc) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (zzoVarZza.zza != zzoVarZzb.zza || zzoVarZza.zzb != zzoVarZzb.zzb) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                    zzk.zza(zzkVar);
                    File dataDir2 = c64.getDataDir(context);
                    if (dataDir2 == null) {
                        if (canonicalPath.startsWith(zzb(Environment.getDataDirectory()))) {
                        }
                        i = 1;
                        if (i == zzkVar.zzd) {
                        }
                    } else if (canonicalPath.startsWith(zzb(dataDir2))) {
                        i = 1;
                        if (i == zzkVar.zzd) {
                            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                        }
                    } else {
                        Context contextCreateDeviceProtectedStorageContext = c64.createDeviceProtectedStorageContext(context);
                        if (contextCreateDeviceProtectedStorageContext == null || (dataDir = c64.getDataDir(contextCreateDeviceProtectedStorageContext)) == null || !canonicalPath.startsWith(zzb(dataDir))) {
                            File[] fileArrZzd = zzd(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zze
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i4 = zzl.zza;
                                    return c64.getExternalFilesDirs(context, null);
                                }
                            });
                            int length3 = fileArrZzd.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 < length3) {
                                    File file = fileArrZzd[i4];
                                    if (file != null && canonicalPath.startsWith(zzb(file))) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    for (File file2 : zzd(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzf
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            int i5 = zzl.zza;
                                            return c64.getExternalCacheDirs(context);
                                        }
                                    })) {
                                        if (file2 == null || !canonicalPath.startsWith(zzb(file2))) {
                                        }
                                    }
                                }
                            }
                            if (i == zzkVar.zzd) {
                            }
                        }
                        i = 1;
                        if (i == zzkVar.zzd) {
                        }
                    }
                }
                throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
            } catch (FileNotFoundException e) {
                zzc(parcelFileDescriptorOpenFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                zzc(parcelFileDescriptorOpenFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        } catch (IOException e3) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e3);
            throw fileNotFoundException2;
        }
    }

    private static String zzb(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    private static void zzc(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) throws IOException {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static File[] zzd(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
