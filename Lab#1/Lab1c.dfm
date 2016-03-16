object Form1: TForm1
  Left = 192
  Top = 124
  Width = 452
  Height = 355
  Caption = 'Form1'
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
    Left = 232
    Top = 40
    Width = 100
    Height = 16
    Caption = #1058#1077#1082#1091#1097#1077#1077' '#1074#1088#1077#1084#1103
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
  end
  object Label2: TLabel
    Left = 184
    Top = 104
    Width = 224
    Height = 16
    Caption = #1043#1088#1072#1092#1080#1095#1077#1082#1089#1082#1080#1077' '#1088#1077#1089#1091#1088#1089#1099' C++ Builder'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
  end
  object PaintBox1: TPaintBox
    Left = 184
    Top = 128
    Width = 209
    Height = 145
    Color = clBtnFace
    ParentColor = False
  end
  object Edit1: TEdit
    Left = 216
    Top = 64
    Width = 121
    Height = 21
    TabOrder = 0
  end
  object Button1: TButton
    Left = 16
    Top = 112
    Width = 75
    Height = 25
    Caption = 'Start'
    TabOrder = 1
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 16
    Top = 152
    Width = 75
    Height = 25
    Caption = 'Stop'
    TabOrder = 2
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 16
    Top = 192
    Width = 75
    Height = 25
    Caption = 'Exit'
    TabOrder = 3
    OnClick = Button3Click
  end
  object Panel1: TPanel
    Left = 128
    Top = 104
    Width = 41
    Height = 65
    Caption = 'Panel1'
    Color = clBackground
    TabOrder = 4
  end
  object Panel2: TPanel
    Left = 128
    Top = 168
    Width = 41
    Height = 105
    Color = clGrayText
    TabOrder = 5
  end
  object Timer1: TTimer
    OnTimer = Timer1Timer
    Left = 24
    Top = 24
  end
  object Timer2: TTimer
    OnTimer = Timer2Timer
    Left = 24
    Top = 64
  end
end
