package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ModelException extends AmplifyException {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class PropertyPathNotFound extends ModelException {
        private final String modelName;

        public /* synthetic */ PropertyPathNotFound(String str, Exception exc, int i10, AbstractC4148f abstractC4148f) {
            this(str, (i10 & 2) != 0 ? null : exc);
        }

        public final String getModelName() {
            return this.modelName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PropertyPathNotFound(String modelName, Exception exc) {
            super("The root property path for the model " + modelName + " could not be found", "Check if the model types were generated with the latest Amplify CLI and try again", exc, null);
            AbstractC4154l.m8923f(modelName, "modelName");
            this.modelName = modelName;
        }
    }

    public /* synthetic */ ModelException(String str, String str2, Exception exc, AbstractC4148f abstractC4148f) {
        this(str, str2, exc);
    }

    public /* synthetic */ ModelException(String str, String str2, Exception exc, int i10, AbstractC4148f abstractC4148f) {
        this(str, str2, (i10 & 4) != 0 ? null : exc, null);
    }

    private ModelException(String str, String str2, Exception exc) {
        super(str, exc, str2);
    }
}
