//---------------------------------------------------------------------------
#include <stdio.h>
#include <vcl.h>
#pragma hdrstop

#include "Lab1b.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;
  int            min    = 0,
                 sec    = 0,
                 milsec = 0;

  TDateTime timer = Time();

//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
Timer2->Enabled = false;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button4Click(TObject *Sender)
{
      Close();
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Timer1Timer(TObject *Sender)
{
TDateTime t  = Now();
         String Value =  t.DateTimeString();
          this->Edit2->Text  =(AnsiString)Value;
        
}
//---------------------------------------------------------------------------
void __fastcall TForm1::Button1Click(TObject *Sender)
{
  this->Timer2->Enabled = true;
  this->Button1->Enabled = false;
  this->Button2->Enabled = true;
  this->Button3->Enabled = false;
  this->Button4->Enabled = false;

}
//---------------------------------------------------------------------------
void __fastcall TForm1::Button2Click(TObject *Sender)
{

  this->Timer2->Enabled = false;
  this->Button1->Enabled = true;
  this->Button2->Enabled = false;
  this->Button3->Enabled = true;
  this->Button4->Enabled = true;
        
}
//---------------------------------------------------------------------------
void __fastcall TForm1::Timer2Timer(TObject *Sender)
{

                sec++;

         if(sec > 60){
                sec-=60;
                min++;
         }
        char buffer[100];
        sprintf(buffer,"%d - sec %d - min ",sec,min);

        this->Edit1->Text = buffer;
        
}
//---------------------------------------------------------------------------
void __fastcall TForm1::Button3Click(TObject *Sender)
{
sec =0 ;
min = 0;

char buffer[100];
        sprintf(buffer,"%d - sec %d - min ",sec,min);

        this->Edit1->Text = buffer;

}
//---------------------------------------------------------------------------
