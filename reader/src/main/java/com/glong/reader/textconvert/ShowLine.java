package com.glong.reader.textconvert;

import java.util.List;

/**
 * 显示的行数据
 */
public class ShowLine {

    //每行中 每个 字符的集合数据
    public List<ShowChar> charsData;

    /**
     * 当前行在当前章节所有行中的索引
     */
    public int indexInChapter;

    /**
     * 是否满一行了
     */
    public boolean isFullLine;

    /**
     * 是否以分段符标志结束的
     */
    public boolean endWithWrapMark;

    /**
     * 获取 每一行的数据
     * @return
     */
    public String getLineData() {
        String lineData = "";
        StringBuilder sb=new StringBuilder("");
        if (charsData == null || charsData.size() == 0) return lineData;
        for (ShowChar c : charsData) {
            sb.append(c.charData);
        }
        return sb.toString();
    }

    /**
     * 获取 每一行首个字符 在这个段落的indexf
     * @return
     */
    public int getLineFirstIndexInChapter() {
        if (charsData == null || charsData.size() <= 0) {
            return -1;
        }
        return charsData.get(0).indexInChapter;
    }

    /**
     *  获取 改行中的最后一个字符 在章节中的index
     * @return
     */
    public int getLineLastIndexInChapter() {
        if (charsData == null || charsData.size() <= 0) {
            return -1;
        }
        return charsData.get(charsData.size() - 1).indexInChapter;
    }
}
