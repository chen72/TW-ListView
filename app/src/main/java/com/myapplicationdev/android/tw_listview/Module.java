package com.myapplicationdev.android.tw_listview;

public class Module {
    private String moduleCode;
    private boolean isPro;

    public Module(String moduleCode, boolean isPro) {
        this.moduleCode = moduleCode;
        this.isPro = isPro;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public boolean isPro() {
        return isPro;
    }

    public void setPro(boolean pro) {
        isPro = pro;
    }
}
