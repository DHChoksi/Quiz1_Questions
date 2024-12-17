package prototype.shallow;

import java.util.List;

public class shallowBookCopy implements Cloneable
{
    private String m_Title;
    private String m_Author;
    private List<String> m_Chapters;

    public shallowBookCopy(String title, String author, List<String> chapters)
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
        return super.clone();
    }

    @Override
    public String toString()
    {
        return "BookShallowCopy [title=" + m_Title + ", author=" + m_Author + ", chapters=" + m_Chapters + "]";
    }
}