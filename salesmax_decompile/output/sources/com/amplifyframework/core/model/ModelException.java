package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public abstract class ModelException extends AmplifyException {

    public static final class PropertyPathNotFound extends ModelException {
        private final String modelName;

        public /* synthetic */ PropertyPathNotFound(String str, Exception exc, int i, id5 id5Var) {
            this(str, (i & 2) != 0 ? null : exc);
        }

        public final String getModelName() {
            return this.modelName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PropertyPathNotFound(String str, Exception exc) {
            super("The root property path for the model " + str + " could not be found", "Check if the model types were generated with the latest Amplify CLI and try again", exc, null);
            sq8.m48649h(str, "modelName");
            this.modelName = str;
        }
    }

    public /* synthetic */ ModelException(String str, String str2, Exception exc, id5 id5Var) {
        this(str, str2, exc);
    }

    public /* synthetic */ ModelException(String str, String str2, Exception exc, int i, id5 id5Var) {
        this(str, str2, (i & 4) != 0 ? null : exc, null);
    }

    private ModelException(String str, String str2, Exception exc) {
        super(str, exc, str2);
    }
}
