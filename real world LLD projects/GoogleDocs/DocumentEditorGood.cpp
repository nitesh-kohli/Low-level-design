#include<bits/stdc++.h>
using namespace std;

//abstraction for document element
class DocumentElement{
    public:
       virtual string render() = 0; //pure virtual function
};

//concerete implementation for text element
class TextElement : public DocumentElement{
    private:
        string text;
    
    public:
        TextElement(string text){
            this->text = text;
        }

        string render() override{
            return text;
        }
};

//concrete implementation for img element
class ImageElement : public DocumentElement{
    private:
        string imagePath;

    public:
        ImageElement(string imagePath){
            this->imagePath = imagePath;
        }

        string render() override{
            return "[image: " + imagePath + "]";
        }
};

class NewLineElement : public DocumentElement{
    public:
        string render() override{
            return "\n";
        }
};

class TabSpaceElement : public DocumentElement{
    public:
        string render() override{
            return "\t";
        }
};

//document class responsible to holding collection of element
class Document{
    private:
        vector<DocumentElement*> documentElements;

    public:
        void addElement(DocumentElement* element){
            documentElements.push_back(element);
        }

        string render(){
            string result;
            for(auto element : documentElements){
                result += element->render();
            }
            return result;
        }
};

//abstract persistence class
class Persistence{
    public:
        virtual void save(string data) = 0;
};

class FileStorage : public Persistence{
    public:
        void save(string data) override{
            ofstream file("document.txt");
            if(file.is_open()){
                file << data;
                file.close();
                cout<<"Document saved as document.txt";
            }
            else{
                cout<<"Error: unable to open file for writing";
            }
        }
};

class DbStorage : public Persistence{
    public:
        void save(string data) override{
            //save to db
        }
};

class DocumentEditor{
    private:
        Document* document;
        Persistence* storage;
        string renderedDocument;

    public:
        DocumentEditor(Document* document, Persistence* storage){
            this->document = document;
            this->storage = storage;
        }

        void addText(string text){
            document->addElement(new TextElement(text));
        }

        void addImage(string imagePath){
            document->addElement(new ImageElement(imagePath));
        }

        void addNewLine(){
            document->addElement(new NewLineElement());
        }

        void addTabSpace(){
            document->addElement(new TabSpaceElement());
        }

        string renderDocument(){
            if(renderedDocument.empty()){
                renderedDocument = document->render();
            }
            return renderedDocument;
        }

        void saveDocument(){
            storage->save(renderDocument());
        }
};

int main(){
    Document* document = new Document();
    Persistence* persistence = new FileStorage();
    DocumentEditor* editor = new DocumentEditor(document, persistence);

    //simulating a client using the editor with common text formatting features
    editor->addText("Hello, World!");
    editor->addNewLine();
    editor->addText("this is a real world document editor example");
    editor->addNewLine();
    editor->addTabSpace();
    editor->addText("indented line after a tab space");
    editor->addNewLine();
    editor->addImage("image.jpg");

    //render and display the final document
    cout<<editor->renderDocument()<<"\n";

    editor->saveDocument();
    
    return 0;
}