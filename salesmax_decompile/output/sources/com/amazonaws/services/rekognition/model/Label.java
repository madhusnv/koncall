package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class Label implements Serializable {
    private List<LabelAlias> aliases;
    private List<LabelCategory> categories;
    private Float confidence;
    private List<Instance> instances;
    private String name;
    private List<Parent> parents;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Label)) {
            return false;
        }
        Label label = (Label) obj;
        if ((label.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (label.getName() != null && !label.getName().equals(getName())) {
            return false;
        }
        if ((label.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (label.getConfidence() != null && !label.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((label.getInstances() == null) ^ (getInstances() == null)) {
            return false;
        }
        if (label.getInstances() != null && !label.getInstances().equals(getInstances())) {
            return false;
        }
        if ((label.getParents() == null) ^ (getParents() == null)) {
            return false;
        }
        if (label.getParents() != null && !label.getParents().equals(getParents())) {
            return false;
        }
        if ((label.getAliases() == null) ^ (getAliases() == null)) {
            return false;
        }
        if (label.getAliases() != null && !label.getAliases().equals(getAliases())) {
            return false;
        }
        if ((label.getCategories() == null) ^ (getCategories() == null)) {
            return false;
        }
        return label.getCategories() == null || label.getCategories().equals(getCategories());
    }

    public List<LabelAlias> getAliases() {
        return this.aliases;
    }

    public List<LabelCategory> getCategories() {
        return this.categories;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public List<Instance> getInstances() {
        return this.instances;
    }

    public String getName() {
        return this.name;
    }

    public List<Parent> getParents() {
        return this.parents;
    }

    public int hashCode() {
        return (((((((((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getInstances() == null ? 0 : getInstances().hashCode())) * 31) + (getParents() == null ? 0 : getParents().hashCode())) * 31) + (getAliases() == null ? 0 : getAliases().hashCode())) * 31) + (getCategories() != null ? getCategories().hashCode() : 0);
    }

    public void setAliases(Collection<LabelAlias> collection) {
        if (collection == null) {
            this.aliases = null;
        } else {
            this.aliases = new ArrayList(collection);
        }
    }

    public void setCategories(Collection<LabelCategory> collection) {
        if (collection == null) {
            this.categories = null;
        } else {
            this.categories = new ArrayList(collection);
        }
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setInstances(Collection<Instance> collection) {
        if (collection == null) {
            this.instances = null;
        } else {
            this.instances = new ArrayList(collection);
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParents(Collection<Parent> collection) {
        if (collection == null) {
            this.parents = null;
        } else {
            this.parents = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getInstances() != null) {
            sb.append("Instances: " + getInstances() + ",");
        }
        if (getParents() != null) {
            sb.append("Parents: " + getParents() + ",");
        }
        if (getAliases() != null) {
            sb.append("Aliases: " + getAliases() + ",");
        }
        if (getCategories() != null) {
            sb.append("Categories: " + getCategories());
        }
        sb.append("}");
        return sb.toString();
    }

    public Label withAliases(LabelAlias... labelAliasArr) {
        if (getAliases() == null) {
            this.aliases = new ArrayList(labelAliasArr.length);
        }
        for (LabelAlias labelAlias : labelAliasArr) {
            this.aliases.add(labelAlias);
        }
        return this;
    }

    public Label withCategories(LabelCategory... labelCategoryArr) {
        if (getCategories() == null) {
            this.categories = new ArrayList(labelCategoryArr.length);
        }
        for (LabelCategory labelCategory : labelCategoryArr) {
            this.categories.add(labelCategory);
        }
        return this;
    }

    public Label withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public Label withInstances(Instance... instanceArr) {
        if (getInstances() == null) {
            this.instances = new ArrayList(instanceArr.length);
        }
        for (Instance instance : instanceArr) {
            this.instances.add(instance);
        }
        return this;
    }

    public Label withName(String str) {
        this.name = str;
        return this;
    }

    public Label withParents(Parent... parentArr) {
        if (getParents() == null) {
            this.parents = new ArrayList(parentArr.length);
        }
        for (Parent parent : parentArr) {
            this.parents.add(parent);
        }
        return this;
    }

    public Label withAliases(Collection<LabelAlias> collection) {
        setAliases(collection);
        return this;
    }

    public Label withCategories(Collection<LabelCategory> collection) {
        setCategories(collection);
        return this;
    }

    public Label withInstances(Collection<Instance> collection) {
        setInstances(collection);
        return this;
    }

    public Label withParents(Collection<Parent> collection) {
        setParents(collection);
        return this;
    }
}
