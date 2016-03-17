object Form1: TForm1
  Left = 390
  Top = 214
  Width = 352
  Height = 271
  Caption = 'MIDPS'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 32
    Top = 16
    Width = 192
    Height = 16
    Caption = #1051#1072#1073#1086#1088#1072#1090#1086#1088#1085#1072#1103' '#1088#1072#1073#1086#1090#1072' '#8470'1'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clRed
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Label2: TLabel
    Left = 48
    Top = 40
    Width = 3
    Height = 13
  end
  object Button1: TButton
    Left = 40
    Top = 72
    Width = 75
    Height = 25
    Caption = 'UP'
    TabOrder = 0
    OnClick = Button1Click
  end
  object Edit1: TEdit
    Left = 40
    Top = 112
    Width = 121
    Height = 21
    TabOrder = 1
  end
  object Button2: TButton
    Left = 40
    Top = 144
    Width = 75
    Height = 25
    Caption = 'DOWN'
    TabOrder = 2
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 208
    Top = 144
    Width = 75
    Height = 25
    Caption = 'Exit'
    TabOrder = 3
    OnClick = Button3Click
  end
end
