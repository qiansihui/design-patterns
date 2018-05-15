package com.design.patterns.structure.bridge;

/**
 * @author qianqian.sun 2018/5/15
 * 描述：
 */
public class SFExpress extends Express {
    private String file;

    public SFExpress(Transport transport, String file) {
        super(transport);
        this.file = file;
    }

    public void trans() {
        transport.trans(file);
    }
}
