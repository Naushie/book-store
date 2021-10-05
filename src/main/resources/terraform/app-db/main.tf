terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 3.0"
    }
  }
}

provider "aws" {
  profile = "default"
  region = "us-east-1"
}

resource "aws_db_instance" "book_store_db" {
  engine = "mysql"
  engine_version = "5.7"
  instance_class = "db.t2.micro"
  name = "BookStoreDB"
  identifier = "book-store-db"
  username = "book_store"
  password = "book_store" #made public for test, generally secured
  allocated_storage = 20
  skip_final_snapshot = true
}