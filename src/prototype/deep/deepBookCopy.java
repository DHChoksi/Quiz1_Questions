package prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class deepBookCopy implements Cloneable
{
    private String m_Title;
    private String m_Author;
    private List<String> m_Chapters;

    public deepBookCopy(String title, String author, List<String> chapters)
    {
        this.m_Title = title;
        this.m_Author = author;
        this.m_Chapters = chapters;
    }

    public String getTitle()
    {
        return m_Title;
    }

    public void setTitle(String title)
    {
        this.m_Title = title;
    }

    public String getAuthor()
    {
        return m_Author;
    }

    public void setAuthor(String author)
    {
        this.m_Author = author;
    }

    public List<String> getChapters()
    {
        return m_Chapters;
    }

    public void setChapters(List<String> chapters)
    {
        this.m_Chapters = chapters;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        deepBookCopy cloned = (deepBookCopy) super.clone();
        // Deep copy of chapters
        cloned.m_Chapters = new ArrayList<>(this.m_Chapters);
        return cloned;
    }

    @Override
    public String toString()
    {
        return "deepBookCopy [title=" + m_Title + ", author=" + m_Author + ", chapters=" + m_Chapters + "]";
    }
}