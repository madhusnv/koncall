package com.amplifyframework.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import i0.m0;
import java.util.Scanner;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Resources {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class ResourceLoadingException extends Exception {
        private static final long serialVersionUID = 1;

        public ResourceLoadingException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    private Resources() {
    }

    @SuppressLint({"DiscouragedApi"})
    public static int getRawResourceId(Context context, String str) throws ResourceLoadingException {
        try {
            return context.getResources().getIdentifier(str, "raw", context.getPackageName());
        } catch (Exception e2) {
            throw new ResourceLoadingException(m0.m7378k("No such resource with identifier ", str), e2);
        }
    }

    public static JSONObject readJsonResource(Context context, String str) {
        return readJsonResourceFromId(context, getRawResourceId(context, str));
    }

    public static JSONObject readJsonResourceFromId(Context context, int i10) throws ResourceLoadingException {
        try {
            Scanner scanner = new Scanner(context.getResources().openRawResource(i10));
            StringBuilder sb2 = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb2.append(scanner.nextLine());
            }
            scanner.close();
            try {
                return new JSONObject(sb2.toString());
            } catch (JSONException e2) {
                throw new ResourceLoadingException(AbstractC5601a.m11232c(i10, "Failed to read the resource with ID ", "."), e2);
            }
        } catch (Resources.NotFoundException e10) {
            throw new ResourceLoadingException(AbstractC4801l.m9730d(i10, "No such resource with ID = "), e10);
        }
    }
}
